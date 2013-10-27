
package artifacts.processArtifact;

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
    "uniqueGuid",
    "processData"
})
public class Process {

    @JsonProperty("uniqueGuid")
    private String uniqueGuid;
    @JsonProperty("processData")
    private ProcessData processData;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("uniqueGuid")
    public String getUniqueGuid() {
        return uniqueGuid;
    }

    @JsonProperty("uniqueGuid")
    public void setUniqueGuid(String uniqueGuid) {
        this.uniqueGuid = uniqueGuid;
    }

    @JsonProperty("processData")
    public ProcessData getProcessData() {
        return processData;
    }

    @JsonProperty("processData")
    public void setProcessData(ProcessData processData) {
        this.processData = processData;
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
