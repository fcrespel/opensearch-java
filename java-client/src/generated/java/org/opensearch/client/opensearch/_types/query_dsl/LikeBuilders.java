/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch._types.query_dsl;

import javax.annotation.Generated;

/**
 * <p>
 * Builders for {@link Like} variants.
 * </p>
 * <p>
 * Variants <code>text</code> are not available here as they don't have a dedicated class. Use {@link Like}'s builder for these.
 * </p>
 */
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class LikeBuilders {
    private LikeBuilders() {}

    /**
     * Creates a builder for the {@link LikeDocument document} {@code Like} variant.
     */
    public static LikeDocument.Builder document() {
        return new LikeDocument.Builder();
    }
}