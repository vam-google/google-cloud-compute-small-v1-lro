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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.HttpJsonTransportChannel;
import com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider;
import com.google.api.gax.httpjson.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.compute.v1.Address;
import com.google.cloud.compute.v1.AddressAggregatedList;
import com.google.cloud.compute.v1.AddressList;
import com.google.cloud.compute.v1.AddressesScopedList;
import com.google.cloud.compute.v1.AggregatedListAddressesRequest;
import com.google.cloud.compute.v1.DeleteAddressRequest;
import com.google.cloud.compute.v1.InsertAddressRequest;
import com.google.cloud.compute.v1.ListAddressesRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.Map.Entry;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link AddressesStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (compute.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of delete to 30 seconds:
 *
 * <pre>
 * <code>
 * AddressesStubSettings.Builder addressesSettingsBuilder =
 *     AddressesStubSettings.newBuilder();
 * addressesSettingsBuilder
 *     .deleteSettings()
 *     .setRetrySettings(
 *         addressesSettingsBuilder.deleteSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * AddressesStubSettings addressesSettings = addressesSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class AddressesStubSettings extends StubSettings<AddressesStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/cloud-platform")
          .add("https://www.googleapis.com/auth/compute")
          .add("https://www.googleapis.com/auth/compute.readonly")
          .build();

  private final PagedCallSettings<
          AggregatedListAddressesRequest, AddressAggregatedList, AggregatedListPagedResponse>
      aggregatedListSettings;
  private final UnaryCallSettings<DeleteAddressRequest, com.google.cloud.compute.v1.Operation>
      deleteSettings;
  private final UnaryCallSettings<InsertAddressRequest, com.google.cloud.compute.v1.Operation>
      insertSettings;
  private final OperationCallSettings<
          InsertAddressRequest,
          com.google.cloud.compute.v1.Operation,
          com.google.cloud.compute.v1.Operation>
      insertOperationSettings;
  private final PagedCallSettings<ListAddressesRequest, AddressList, ListPagedResponse>
      listSettings;

  /** Returns the object with the settings used for calls to aggregatedList. */
  public PagedCallSettings<
          AggregatedListAddressesRequest, AddressAggregatedList, AggregatedListPagedResponse>
      aggregatedListSettings() {
    return aggregatedListSettings;
  }

  /** Returns the object with the settings used for calls to delete. */
  public UnaryCallSettings<DeleteAddressRequest, com.google.cloud.compute.v1.Operation>
      deleteSettings() {
    return deleteSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  public UnaryCallSettings<InsertAddressRequest, com.google.cloud.compute.v1.Operation>
      insertSettings() {
    return insertSettings;
  }

  /** Returns the object with the settings used for calls to insert. */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallSettings<
          InsertAddressRequest,
          com.google.cloud.compute.v1.Operation,
          com.google.cloud.compute.v1.Operation>
      insertOperationSettings() {
    return insertOperationSettings;
  }

  /** Returns the object with the settings used for calls to list. */
  public PagedCallSettings<ListAddressesRequest, AddressList, ListPagedResponse> listSettings() {
    return listSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public AddressesStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(HttpJsonTransportChannel.getHttpJsonTransportName())) {
      return HttpJsonAddressesStub.create(this);
    } else {
      throw new UnsupportedOperationException(
          "Transport not supported: " + getTransportChannelProvider().getTransportName());
    }
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "compute.googleapis.com";
  }

  /** Returns the default service port. */
  public static int getDefaultServicePort() {
    return 443;
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingHttpJsonChannelProvider.Builder
      defaultHttpJsonTransportProviderBuilder() {
    return InstantiatingHttpJsonChannelProvider.newBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultHttpJsonTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(AddressesStubSettings.class))
        .setTransportToken(
            GaxHttpJsonProperties.getHttpJsonTokenName(),
            GaxHttpJsonProperties.getHttpJsonVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected AddressesStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    aggregatedListSettings = settingsBuilder.aggregatedListSettings().build();
    deleteSettings = settingsBuilder.deleteSettings().build();
    insertSettings = settingsBuilder.insertSettings().build();
    insertOperationSettings = settingsBuilder.insertOperationSettings().build();
    listSettings = settingsBuilder.listSettings().build();
  }

  private static final PagedListDescriptor<
          AggregatedListAddressesRequest, AddressAggregatedList, Entry<String, AddressesScopedList>>
      AGGREGATED_LIST_PAGE_STR_DESC =
          new PagedListDescriptor<
              AggregatedListAddressesRequest,
              AddressAggregatedList,
              Entry<String, AddressesScopedList>>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public AggregatedListAddressesRequest injectToken(
                AggregatedListAddressesRequest payload, String token) {
              return AggregatedListAddressesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public AggregatedListAddressesRequest injectPageSize(
                AggregatedListAddressesRequest payload, int pageSize) {
              return AggregatedListAddressesRequest.newBuilder(payload)
                  .setMaxResults(pageSize)
                  .build();
            }

            @Override
            public Integer extractPageSize(AggregatedListAddressesRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(AddressAggregatedList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Entry<String, AddressesScopedList>> extractResources(
                AddressAggregatedList payload) {
              return payload.getItemsMap() != null
                  ? payload.getItemsMap().entrySet()
                  : ImmutableList.<Entry<String, AddressesScopedList>>of();
            }
          };

  private static final PagedListDescriptor<ListAddressesRequest, AddressList, Address>
      LIST_PAGE_STR_DESC =
          new PagedListDescriptor<ListAddressesRequest, AddressList, Address>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListAddressesRequest injectToken(ListAddressesRequest payload, String token) {
              return ListAddressesRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListAddressesRequest injectPageSize(ListAddressesRequest payload, int pageSize) {
              return ListAddressesRequest.newBuilder(payload).setMaxResults(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListAddressesRequest payload) {
              return payload.getMaxResults();
            }

            @Override
            public String extractNextToken(AddressList payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Address> extractResources(AddressList payload) {
              return payload.getItemsList() != null
                  ? payload.getItemsList()
                  : ImmutableList.<Address>of();
            }
          };

  private static final PagedListResponseFactory<
          AggregatedListAddressesRequest, AddressAggregatedList, AggregatedListPagedResponse>
      AGGREGATED_LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<
              AggregatedListAddressesRequest,
              AddressAggregatedList,
              AggregatedListPagedResponse>() {
            @Override
            public ApiFuture<AggregatedListPagedResponse> getFuturePagedResponse(
                UnaryCallable<AggregatedListAddressesRequest, AddressAggregatedList> callable,
                AggregatedListAddressesRequest request,
                ApiCallContext context,
                ApiFuture<AddressAggregatedList> futureResponse) {
              PageContext<
                      AggregatedListAddressesRequest,
                      AddressAggregatedList,
                      Entry<String, AddressesScopedList>>
                  pageContext =
                      PageContext.create(callable, AGGREGATED_LIST_PAGE_STR_DESC, request, context);
              return AggregatedListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  private static final PagedListResponseFactory<
          ListAddressesRequest, AddressList, ListPagedResponse>
      LIST_PAGE_STR_FACT =
          new PagedListResponseFactory<ListAddressesRequest, AddressList, ListPagedResponse>() {
            @Override
            public ApiFuture<ListPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListAddressesRequest, AddressList> callable,
                ListAddressesRequest request,
                ApiCallContext context,
                ApiFuture<AddressList> futureResponse) {
              PageContext<ListAddressesRequest, AddressList, Address> pageContext =
                  PageContext.create(callable, LIST_PAGE_STR_DESC, request, context);
              return ListPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Builder for AddressesStubSettings. */
  public static class Builder extends StubSettings.Builder<AddressesStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

    private final PagedCallSettings.Builder<
            AggregatedListAddressesRequest, AddressAggregatedList, AggregatedListPagedResponse>
        aggregatedListSettings;
    private final UnaryCallSettings.Builder<
            DeleteAddressRequest, com.google.cloud.compute.v1.Operation>
        deleteSettings;
    private final UnaryCallSettings.Builder<
            InsertAddressRequest, com.google.cloud.compute.v1.Operation>
        insertSettings;
    private final OperationCallSettings.Builder<
            InsertAddressRequest,
            com.google.cloud.compute.v1.Operation,
            com.google.cloud.compute.v1.Operation>
        insertOperationSettings;
    private final PagedCallSettings.Builder<ListAddressesRequest, AddressList, ListPagedResponse>
        listSettings;

    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "idempotent",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
      definitions.put("non_idempotent", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelay(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelay(Duration.ofMillis(60000L))
              .setInitialRpcTimeout(Duration.ofMillis(20000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeout(Duration.ofMillis(20000L))
              .setTotalTimeout(Duration.ofMillis(600000L))
              .build();
      definitions.put("default", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      aggregatedListSettings = PagedCallSettings.newBuilder(AGGREGATED_LIST_PAGE_STR_FACT);

      deleteSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      insertOperationSettings = OperationCallSettings.newBuilder();

      listSettings = PagedCallSettings.newBuilder(LIST_PAGE_STR_FACT);

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              aggregatedListSettings, deleteSettings, insertSettings, listSettings);

      initDefaults(this);
    }

    private static Builder createDefault() {
      Builder builder = new Builder((ClientContext) null);
      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {

      builder
          .aggregatedListSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .deleteSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .insertSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));

      builder
          .listSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("idempotent"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"));
      builder
          .insertOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<InsertAddressRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("non_idempotent"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("default"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(
                  com.google.cloud.compute.v1.Operation.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(
                  com.google.cloud.compute.v1.Operation.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(500L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(5000L))
                      .setInitialRpcTimeout(Duration.ZERO) // ignored
                      .setRpcTimeoutMultiplier(1.0) // ignored
                      .setMaxRpcTimeout(Duration.ZERO) // ignored
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    protected Builder(AddressesStubSettings settings) {
      super(settings);

      aggregatedListSettings = settings.aggregatedListSettings.toBuilder();
      deleteSettings = settings.deleteSettings.toBuilder();
      insertSettings = settings.insertSettings.toBuilder();
      insertOperationSettings = settings.insertOperationSettings.toBuilder();
      listSettings = settings.listSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              aggregatedListSettings, deleteSettings, insertSettings, listSettings);
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to aggregatedList. */
    public PagedCallSettings.Builder<
            AggregatedListAddressesRequest, AddressAggregatedList, AggregatedListPagedResponse>
        aggregatedListSettings() {
      return aggregatedListSettings;
    }

    /** Returns the builder for the settings used for calls to delete. */
    public UnaryCallSettings.Builder<DeleteAddressRequest, com.google.cloud.compute.v1.Operation>
        deleteSettings() {
      return deleteSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    public UnaryCallSettings.Builder<InsertAddressRequest, com.google.cloud.compute.v1.Operation>
        insertSettings() {
      return insertSettings;
    }

    /** Returns the builder for the settings used for calls to insert. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            InsertAddressRequest,
            com.google.cloud.compute.v1.Operation,
            com.google.cloud.compute.v1.Operation>
        insertOperationSettings() {
      return insertOperationSettings;
    }

    /** Returns the builder for the settings used for calls to list. */
    public PagedCallSettings.Builder<ListAddressesRequest, AddressList, ListPagedResponse>
        listSettings() {
      return listSettings;
    }

    @Override
    public AddressesStubSettings build() throws IOException {
      return new AddressesStubSettings(this);
    }
  }
}
