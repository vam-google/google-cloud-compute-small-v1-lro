/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute;

import com.google.api.gax.longrunning.OperationFuture;
import com.google.cloud.compute.v1.Address;
import com.google.cloud.compute.v1.AddressesClient;
import com.google.cloud.compute.v1.Operation;
import com.google.protobuf.util.JsonFormat;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class ComputeExample {

  public static void main(String[] args)
      throws IOException, InterruptedException, ExecutionException {
    final String project = "vam-veneer";
    final String region = "us-central1";
    final String address = "test-address-21";

    AddressesClient addressesClient = AddressesClient.create();

    Iterable<Address> addresses = addressesClient.list(project, region, "name").iterateAll();
    for (Address addr : addresses) {
      System.out.println(JsonFormat.printer().print(addr));
    }

    System.out.println("\n===============\nAddressClient#insert()\n===============");
    OperationFuture<Operation, Operation> insertResponse =
        addressesClient.insertAsync(project, region, Address.newBuilder().setName(address).build());

    // for(int attemptCount = 0; !insertResponse.isDone(); attemptCount++)  {
    //   Operation op = insertResponse.getMetadata().get();
    //   System.out.println("Attempt " + attemptCount);
    //   System.out.println(System.identityHashCode(op));
    //   System.out.println(JsonFormat.printer().print(op) + "\n");
    // }

    Operation completedOperation = insertResponse.get();
    System.out.println("insertResponse.isDone() = " + insertResponse.isDone());
    System.out.println(JsonFormat.printer().print(completedOperation) + "\n");

    System.out.println("\n===============\nAddressClient#delete()\n===============");
    Operation deleteResponse = addressesClient.delete(project, region, address);
    System.out.println(JsonFormat.printer().print(deleteResponse) + "\n");
  }
}
