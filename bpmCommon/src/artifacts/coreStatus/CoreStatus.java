
package artifacts.coreStatus;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.ektorp.support.CouchDbDocument;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "startId",
    "serverStartTime",
    "elements"
})
public class CoreStatus extends CouchDbDocument{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("docType")
	private String docType;
	@JsonProperty("startId")
    private String startId;
    @JsonProperty("serverStartTime")
    private String serverStartTime;
    @JsonProperty("elements")
    private Elements elements;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("startId")
    public String getStartId() {
        return startId;
    }

    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }
    
    @JsonProperty("startId")
    public void setStartId(String startId) {
        this.startId = startId;
    }

    @JsonProperty("serverStartTime")
    public String getServerStartTime() {
        return serverStartTime;
    }

    @JsonProperty("serverStartTime")
    public void setServerStartTime(String serverStartTime) {
        this.serverStartTime = serverStartTime;
    }

    @JsonProperty("elements")
    public Elements getElements() {
        return elements;
    }

    @JsonProperty("elements")
    public void setElements(Elements elements) {
        this.elements = elements;
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
