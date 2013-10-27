
package artifacts.requestCallback;

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
    "docType",
    "requestGuid",
    "worked",
    "type",
    "userGuid"
})
public class RequestCallBack {

    @JsonProperty("docType")
    private String docType;
    @JsonProperty("requestGuid")
    private String requestGuid;
    @JsonProperty("worked")
    private String worked;
    @JsonProperty("type")
    private Boolean type;
    @JsonProperty("userGuid")
    private String userGuid;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("requestGuid")
    public String getRequestGuid() {
        return requestGuid;
    }

    @JsonProperty("requestGuid")
    public void setRequestGuid(String requestGuid) {
        this.requestGuid = requestGuid;
    }

    @JsonProperty("worked")
    public String getWorked() {
        return worked;
    }

    @JsonProperty("worked")
    public void setWorked(String worked) {
        this.worked = worked;
    }

    @JsonProperty("type")
    public Boolean getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Boolean type) {
        this.type = type;
    }

    @JsonProperty("userGuid")
    public String getUserGuid() {
        return userGuid;
    }

    @JsonProperty("userGuid")
    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
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
