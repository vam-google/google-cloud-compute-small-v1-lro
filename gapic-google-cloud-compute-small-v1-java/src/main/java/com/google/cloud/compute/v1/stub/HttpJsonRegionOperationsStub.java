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
package com.google.cloud.compute.v1.stub;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonLongRunningClient;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStatusCode;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.OperationSnapshotFactory;
import com.google.api.gax.httpjson.PollingRequestFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.LongRunningClient;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.GetRegionOperationRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.Operation.Status;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * REST stub implementation for Google Compute Engine API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonRegionOperationsStub extends RegionOperationsStub {

  @InternalApi
  public static final ApiMethodDescriptor<GetRegionOperationRequest, Operation>
      getMethodDescriptor =
          ApiMethodDescriptor.<GetRegionOperationRequest, Operation>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.RegionOperations.Get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetRegionOperationRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/regions/{region}/operations/{operation}",
                          new FieldsExtractor<GetRegionOperationRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(GetRegionOperationRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<GetRegionOperationRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              serializer.putPathParam(fields, "region", request.getRegion());
                              serializer.putPathParam(fields, "operation", request.getOperation());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              GetRegionOperationRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                GetRegionOperationRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<GetRegionOperationRequest> serializer =
                                  ProtoRestSerializer.create();

                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<GetRegionOperationRequest, String>() {
                            @Override
                            public String extract(GetRegionOperationRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Operation>newBuilder()
                      .setDefaultInstance(Operation.getDefaultInstance())
                      .build())
              .setOperationSnapshotFactory(
                  new OperationSnapshotFactory<GetRegionOperationRequest, Operation>() {
                    @Override
                    public OperationSnapshot create(
                        GetRegionOperationRequest request, Operation response) {
                      return HttpJsonOperationSnapshot.newBuilder()
                          .setName(response.getId())
                          .setMetadata(response)
                          .setDone(response.getStatus() == Status.DONE)
                          .setResponse(response)
                          .setError(
                              response.getHttpErrorStatusCode(), response.getHttpErrorMessage())
                          .build();
                    }
                  })
              .setPollingRequestFactory(
                  new PollingRequestFactory<GetRegionOperationRequest>() {
                    @Override
                    public GetRegionOperationRequest create(String compoundOperationId) {
                      // Operation first, the rest are in alphabetical order
                      String[] idComponents = compoundOperationId.split(":");
                      return GetRegionOperationRequest.newBuilder()
                          .setOperation(idComponents[0])
                          .setProject(idComponents[1])
                          .setRegion(idComponents[2])
                          .build();
                    }
                  })
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<GetRegionOperationRequest, Operation> getCallable;

  private final LongRunningClient longRunningClient;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonRegionOperationsStub create(RegionOperationsStubSettings settings)
      throws IOException {
    return new HttpJsonRegionOperationsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionOperationsStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonRegionOperationsStub(
        RegionOperationsStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonRegionOperationsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonRegionOperationsStub(
        RegionOperationsStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonRegionOperationsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonRegionOperationsStub(
      RegionOperationsStubSettings settings, ClientContext clientContext) throws IOException {
    this(settings, clientContext, new HttpJsonRegionOperationsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonRegionOperationsStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected HttpJsonRegionOperationsStub(
      RegionOperationsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<GetRegionOperationRequest, Operation> getTransportSettings =
        HttpJsonCallSettings.<GetRegionOperationRequest, Operation>newBuilder()
            .setMethodDescriptor(getMethodDescriptor)
            .build();

    this.getCallable =
        callableFactory.createUnaryCallable(
            getTransportSettings, settings.getSettings(), clientContext);

    this.longRunningClient =
        new HttpJsonLongRunningClient<GetRegionOperationRequest, Operation>(
            getCallable,
            getMethodDescriptor.getOperationSnapshotFactory(),
            getMethodDescriptor.getPollingRequestFactory());

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @Override
  public UnaryCallable<GetRegionOperationRequest, Operation> getCallable() {
    return getCallable;
  }

  @Override
  public LongRunningClient longRunningClient() {
    return longRunningClient;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
