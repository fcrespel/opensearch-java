/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.ml;

import jakarta.json.stream.JsonGenerator;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import org.opensearch.client.json.JsonData;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;

// typedef: ml.UndeployModelNode

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class UndeployModelNode implements PlainJsonSerializable {

    private final Map<String, JsonData> stats;

    // ---------------------------------------------------------------------------------------------

    private UndeployModelNode(Builder builder) {
        this.stats = ApiTypeHelper.unmodifiable(builder.stats);
    }

    public static UndeployModelNode of(Function<UndeployModelNode.Builder, ObjectBuilder<UndeployModelNode>> fn) {
        return fn.apply(new Builder()).build();
    }

    /**
     * API name: {@code stats}
     */
    public final Map<String, JsonData> stats() {
        return this.stats;
    }

    /**
     * Serialize this object to JSON.
     */
    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        serializeInternal(generator, mapper);
        generator.writeEnd();
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        if (ApiTypeHelper.isDefined(this.stats)) {
            generator.writeKey("stats");
            generator.writeStartObject();
            for (Map.Entry<String, JsonData> item0 : this.stats.entrySet()) {
                generator.writeKey(item0.getKey());
                item0.getValue().serialize(generator, mapper);
            }
            generator.writeEnd();
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link UndeployModelNode}.
     */
    public static class Builder extends ObjectBuilderBase implements ObjectBuilder<UndeployModelNode> {
        @Nullable
        private Map<String, JsonData> stats;

        /**
         * API name: {@code stats}
         *
         * <p>
         * Adds all elements of <code>map</code> to <code>stats</code>.
         * </p>
         */
        public final Builder stats(Map<String, JsonData> map) {
            this.stats = _mapPutAll(this.stats, map);
            return this;
        }

        /**
         * API name: {@code stats}
         *
         * <p>
         * Adds an entry to <code>stats</code>.
         * </p>
         */
        public final Builder stats(String key, JsonData value) {
            this.stats = _mapPut(this.stats, key, value);
            return this;
        }

        /**
         * Builds a {@link UndeployModelNode}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        public UndeployModelNode build() {
            _checkSingleUse();

            return new UndeployModelNode(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link UndeployModelNode}
     */
    public static final JsonpDeserializer<UndeployModelNode> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        UndeployModelNode::setupUndeployModelNodeDeserializer
    );

    protected static void setupUndeployModelNodeDeserializer(ObjectDeserializer<UndeployModelNode.Builder> op) {
        op.add(Builder::stats, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "stats");
    }
}