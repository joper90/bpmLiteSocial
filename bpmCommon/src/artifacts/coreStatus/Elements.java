
package artifacts.coreStatus;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "dynamicKey",
    "dynamicValue"
})
public class Elements {

    @JsonProperty("dynamicKey")
    private String dynamicKey;
    @JsonProperty("dynamicValue")
    private String dynamicValue;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("dynamicKey")
    public String getDynamicKey() {
        return dynamicKey;
    }

    @JsonProperty("dynamicKey")
    public void setDynamicKey(String dynamicKey) {
        this.dynamicKey = dynamicKey;
    }

    @JsonProperty("dynamicValue")
    public String getDynamicValue() {
        return dynamicValue;
    }

    @JsonProperty("dynamicValue")
    public void setDynamicValue(String dynamicValue) {
        this.dynamicValue = dynamicValue;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
