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

/**
 * A client to Google Compute Engine API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>=============== AddressesClient ===============
 *
 * <p>Service Description: Services
 *
 * <p>The Addresses API.
 *
 * <p>Sample for AddressesClient:
 *
 * <pre>
 * <code>
 * try (AddressesClient addressesClient = AddressesClient.create()) {
 *   String project = "";
 *   String region = "";
 *   String address = "";
 *   com.google.cloud.compute.v1.Operation response = addressesClient.delete(project, region, address);
 * }
 * </code>
 * </pre>
 *
 * ====================== RegionOperationsClient ======================
 *
 * <p>Service Description: The RegionOperations API.
 *
 * <p>Sample for RegionOperationsClient:
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
 */
@Generated("by gapic-generator")
package com.google.cloud.compute.v1;

import javax.annotation.Generated;
