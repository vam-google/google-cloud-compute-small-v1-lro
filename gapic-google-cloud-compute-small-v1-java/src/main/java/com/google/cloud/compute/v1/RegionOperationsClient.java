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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.stub.RegionOperationsStub;
import com.google.cloud.compute.v1.stub.RegionOperationsStubSettings;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The RegionOperations API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (RegionOperationsClient regionOperationsClient = RegionOperationsClient.create()) {
 *   String project = "";
 *   String region = "";
 *   String operation = "";
 *   Operation response = regionOperationsClient.get(project, region, operation);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the regionOperationsClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of RegionOperationsSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * RegionOperationsSettings regionOperationsSettings =
 *     RegionOperationsSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * RegionOperationsClient regionOperationsClient =
 *     RegionOperationsClient.create(regionOperationsSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * RegionOperationsSettings regionOperationsSettings =
 *     RegionOperationsSettings.newBuilder().setEndpoint(myEndpoint).build();
 * RegionOperationsClient regionOperationsClient =
 *     RegionOperationsClient.create(regionOperationsSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class RegionOperationsClient implements BackgroundResource {
  private final RegionOperationsSettings settings;
  private final RegionOperationsStub stub;

  /** Constructs an instance of RegionOperationsClient with default settings. */
  public static final RegionOperationsClient create() throws IOException {
    return create(RegionOperationsSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of RegionOperationsClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final RegionOperationsClient create(RegionOperationsSettings settings)
      throws IOException {
    return new RegionOperationsClient(settings);
  }

  /**
   * Constructs an instance of RegionOperationsClient, using the given stub for making calls. This
   * is for advanced usage - prefer to use RegionOperationsSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final RegionOperationsClient create(RegionOperationsStub stub) {
    return new RegionOperationsClient(stub);
  }

  /**
   * Constructs an instance of RegionOperationsClient, using the given settings. This is protected
   * so that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected RegionOperationsClient(RegionOperationsSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((RegionOperationsStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected RegionOperationsClient(RegionOperationsStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final RegionOperationsSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public RegionOperationsStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified region-specific Operations resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionOperationsClient regionOperationsClient = RegionOperationsClient.create()) {
   *   String project = "";
   *   String region = "";
   *   String operation = "";
   *   Operation response = regionOperationsClient.get(project, region, operation);
   * }
   * </code></pre>
   *
   * @param project Project ID for this request.
   * @param region Name of the region for this request.
   * @param operation Name of the Operations resource to return.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation get(String project, String region, String operation) {
    GetRegionOperationRequest request =
        GetRegionOperationRequest.newBuilder()
            .setProject(project)
            .setRegion(region)
            .setOperation(operation)
            .build();
    return get(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified region-specific Operations resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionOperationsClient regionOperationsClient = RegionOperationsClient.create()) {
   *   String operation = "";
   *   String project = "";
   *   String region = "";
   *   GetRegionOperationRequest request = GetRegionOperationRequest.newBuilder()
   *     .setOperation(operation)
   *     .setProject(project)
   *     .setRegion(region)
   *     .build();
   *   Operation response = regionOperationsClient.get(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Operation get(GetRegionOperationRequest request) {
    return getCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the specified region-specific Operations resource.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (RegionOperationsClient regionOperationsClient = RegionOperationsClient.create()) {
   *   String operation = "";
   *   String project = "";
   *   String region = "";
   *   GetRegionOperationRequest request = GetRegionOperationRequest.newBuilder()
   *     .setOperation(operation)
   *     .setProject(project)
   *     .setRegion(region)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = regionOperationsClient.getCallable().futureCall(request);
   *   // Do something
   *   Operation response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetRegionOperationRequest, Operation> getCallable() {
    return stub.getCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
