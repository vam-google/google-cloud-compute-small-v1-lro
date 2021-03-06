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

import static com.google.cloud.compute.v1.AddressesClient.AggregatedListPagedResponse;
import static com.google.cloud.compute.v1.AddressesClient.ListPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.FieldsExtractor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonOperationSnapshot;
import com.google.api.gax.httpjson.HttpJsonStatusCode;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.OperationSnapshotFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.AddressAggregatedList;
import com.google.cloud.compute.v1.AddressList;
import com.google.cloud.compute.v1.AggregatedListAddressesRequest;
import com.google.cloud.compute.v1.DeleteAddressRequest;
import com.google.cloud.compute.v1.InsertAddressRequest;
import com.google.cloud.compute.v1.ListAddressesRequest;
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
public class HttpJsonAddressesStub extends AddressesStub {

  @InternalApi
  public static final ApiMethodDescriptor<AggregatedListAddressesRequest, AddressAggregatedList>
      aggregatedListMethodDescriptor =
          ApiMethodDescriptor.<AggregatedListAddressesRequest, AddressAggregatedList>newBuilder()
              .setFullMethodName("google.cloud.compute.v1.Addresses.AggregatedList")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<AggregatedListAddressesRequest>newBuilder()
                      .setPath(
                          "/compute/v1/projects/{project}/aggregated/addresses",
                          new FieldsExtractor<
                              AggregatedListAddressesRequest, Map<String, String>>() {
                            @Override
                            public Map<String, String> extract(
                                AggregatedListAddressesRequest request) {
                              Map<String, String> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListAddressesRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putPathParam(fields, "project", request.getProject());
                              return fields;
                            }
                          })
                      .setQueryParamsExtractor(
                          new FieldsExtractor<
                              AggregatedListAddressesRequest, Map<String, List<String>>>() {
                            @Override
                            public Map<String, List<String>> extract(
                                AggregatedListAddressesRequest request) {
                              Map<String, List<String>> fields = new HashMap<>();
                              ProtoRestSerializer<AggregatedListAddressesRequest> serializer =
                                  ProtoRestSerializer.create();
                              serializer.putQueryParam(fields, "filter", request.getFilter());
                              serializer.putQueryParam(
                                  fields, "includeAllScopes", request.getIncludeAllScopes());
                              serializer.putQueryParam(
                                  fields, "maxResults", request.getMaxResults());
                              serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                              serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                              return fields;
                            }
                          })
                      .setRequestBodyExtractor(
                          new FieldsExtractor<AggregatedListAddressesRequest, String>() {
                            @Override
                            public String extract(AggregatedListAddressesRequest request) {
                              return "";
                            }
                          })
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<AddressAggregatedList>newBuilder()
                      .setDefaultInstance(AddressAggregatedList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeleteAddressRequest, Operation> deleteMethodDescriptor =
      ApiMethodDescriptor.<DeleteAddressRequest, Operation>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.Addresses.Delete")
          .setHttpMethod(HttpMethods.DELETE)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<DeleteAddressRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/regions/{region}/addresses/{address}",
                      new FieldsExtractor<DeleteAddressRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(DeleteAddressRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<DeleteAddressRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "region", request.getRegion());
                          serializer.putPathParam(fields, "address", request.getAddress());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<DeleteAddressRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(DeleteAddressRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<DeleteAddressRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putQueryParam(fields, "requestId", request.getRequestId());
                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<DeleteAddressRequest, String>() {
                        @Override
                        public String extract(DeleteAddressRequest request) {
                          return "";
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Operation>newBuilder()
                  .setDefaultInstance(Operation.getDefaultInstance())
                  .build())
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<InsertAddressRequest, Operation> insertMethodDescriptor =
      ApiMethodDescriptor.<InsertAddressRequest, Operation>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.Addresses.Insert")
          .setHttpMethod(HttpMethods.POST)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<InsertAddressRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/regions/{region}/addresses",
                      new FieldsExtractor<InsertAddressRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(InsertAddressRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<InsertAddressRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "region", request.getRegion());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<InsertAddressRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(InsertAddressRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<InsertAddressRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putQueryParam(fields, "requestId", request.getRequestId());
                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<InsertAddressRequest, String>() {
                        @Override
                        public String extract(InsertAddressRequest request) {
                          return ProtoRestSerializer.create()
                              .toBody("addressResource", request.getAddressResource());
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Operation>newBuilder()
                  .setDefaultInstance(Operation.getDefaultInstance())
                  .build())
          .setOperationSnapshotFactory(
              new OperationSnapshotFactory<InsertAddressRequest, Operation>() {
                @Override
                public OperationSnapshot create(InsertAddressRequest request, Operation response) {
                  StringBuilder opName = new StringBuilder(response.getId());
                  opName.append(":").append(request.getProject());
                  opName.append(":").append(request.getRegion());
                  boolean done = response.getStatus() == Status.DONE;
                  return HttpJsonOperationSnapshot.newBuilder()
                      .setName(opName.toString())
                      .setMetadata(response)
                      .setDone(response.getStatus() == Status.DONE)
                      .setResponse(response)
                      .setError(response.getHttpErrorStatusCode(), response.getHttpErrorMessage())
                      .build();
                }
              })
          .build();

  @InternalApi
  public static final ApiMethodDescriptor<ListAddressesRequest, AddressList> listMethodDescriptor =
      ApiMethodDescriptor.<ListAddressesRequest, AddressList>newBuilder()
          .setFullMethodName("google.cloud.compute.v1.Addresses.List")
          .setHttpMethod(HttpMethods.GET)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<ListAddressesRequest>newBuilder()
                  .setPath(
                      "/compute/v1/projects/{project}/regions/{region}/addresses",
                      new FieldsExtractor<ListAddressesRequest, Map<String, String>>() {
                        @Override
                        public Map<String, String> extract(ListAddressesRequest request) {
                          Map<String, String> fields = new HashMap<>();
                          ProtoRestSerializer<ListAddressesRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putPathParam(fields, "project", request.getProject());
                          serializer.putPathParam(fields, "region", request.getRegion());
                          return fields;
                        }
                      })
                  .setQueryParamsExtractor(
                      new FieldsExtractor<ListAddressesRequest, Map<String, List<String>>>() {
                        @Override
                        public Map<String, List<String>> extract(ListAddressesRequest request) {
                          Map<String, List<String>> fields = new HashMap<>();
                          ProtoRestSerializer<ListAddressesRequest> serializer =
                              ProtoRestSerializer.create();
                          serializer.putQueryParam(fields, "filter", request.getFilter());
                          serializer.putQueryParam(fields, "maxResults", request.getMaxResults());
                          serializer.putQueryParam(fields, "orderBy", request.getOrderBy());
                          serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                          return fields;
                        }
                      })
                  .setRequestBodyExtractor(
                      new FieldsExtractor<ListAddressesRequest, String>() {
                        @Override
                        public String extract(ListAddressesRequest request) {
                          return "";
                        }
                      })
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<AddressList>newBuilder()
                  .setDefaultInstance(AddressList.getDefaultInstance())
                  .build())
          .build();

  private final BackgroundResource backgroundResources;
  private final HttpJsonRegionOperationsStub operationsStub;

  private final UnaryCallable<AggregatedListAddressesRequest, AddressAggregatedList>
      aggregatedListCallable;
  private final UnaryCallable<AggregatedListAddressesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable;
  private final UnaryCallable<DeleteAddressRequest, Operation> deleteCallable;
  private final UnaryCallable<InsertAddressRequest, Operation> insertCallable;
  private final OperationCallable<InsertAddressRequest, Operation, Operation>
      insertOperationCallable;
  private final UnaryCallable<ListAddressesRequest, AddressList> listCallable;
  private final UnaryCallable<ListAddressesRequest, ListPagedResponse> listPagedCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonAddressesStub create(AddressesStubSettings settings)
      throws IOException {
    return new HttpJsonAddressesStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonAddressesStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonAddressesStub(AddressesStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonAddressesStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonAddressesStub(
        AddressesStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonAddressesStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonAddressesStub(AddressesStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonAddressesCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonAddressesStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonAddressesStub(
      AddressesStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = HttpJsonRegionOperationsStub.create(clientContext, callableFactory);

    HttpJsonCallSettings<AggregatedListAddressesRequest, AddressAggregatedList>
        aggregatedListTransportSettings =
            HttpJsonCallSettings.<AggregatedListAddressesRequest, AddressAggregatedList>newBuilder()
                .setMethodDescriptor(aggregatedListMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteAddressRequest, Operation> deleteTransportSettings =
        HttpJsonCallSettings.<DeleteAddressRequest, Operation>newBuilder()
            .setMethodDescriptor(deleteMethodDescriptor)
            .build();
    HttpJsonCallSettings<InsertAddressRequest, Operation> insertTransportSettings =
        HttpJsonCallSettings.<InsertAddressRequest, Operation>newBuilder()
            .setMethodDescriptor(insertMethodDescriptor)
            .build();
    HttpJsonCallSettings<ListAddressesRequest, AddressList> listTransportSettings =
        HttpJsonCallSettings.<ListAddressesRequest, AddressList>newBuilder()
            .setMethodDescriptor(listMethodDescriptor)
            .build();

    this.aggregatedListCallable =
        callableFactory.createUnaryCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.aggregatedListPagedCallable =
        callableFactory.createPagedCallable(
            aggregatedListTransportSettings, settings.aggregatedListSettings(), clientContext);
    this.deleteCallable =
        callableFactory.createUnaryCallable(
            deleteTransportSettings, settings.deleteSettings(), clientContext);
    this.insertCallable =
        callableFactory.createUnaryCallable(
            insertTransportSettings, settings.insertSettings(), clientContext);
    this.insertOperationCallable =
        callableFactory.createOperationCallable(
            insertTransportSettings,
            settings.insertOperationSettings(),
            clientContext,
            this.operationsStub);
    this.listCallable =
        callableFactory.createUnaryCallable(
            listTransportSettings, settings.listSettings(), clientContext);
    this.listPagedCallable =
        callableFactory.createPagedCallable(
            listTransportSettings, settings.listSettings(), clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public UnaryCallable<AggregatedListAddressesRequest, AggregatedListPagedResponse>
      aggregatedListPagedCallable() {
    return aggregatedListPagedCallable;
  }

  public UnaryCallable<AggregatedListAddressesRequest, AddressAggregatedList>
      aggregatedListCallable() {
    return aggregatedListCallable;
  }

  public UnaryCallable<DeleteAddressRequest, Operation> deleteCallable() {
    return deleteCallable;
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<InsertAddressRequest, Operation, Operation> insertOperationCallable() {
    return insertOperationCallable;
  }

  public UnaryCallable<InsertAddressRequest, Operation> insertCallable() {
    return insertCallable;
  }

  public UnaryCallable<ListAddressesRequest, ListPagedResponse> listPagedCallable() {
    return listPagedCallable;
  }

  public UnaryCallable<ListAddressesRequest, AddressList> listCallable() {
    return listCallable;
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
