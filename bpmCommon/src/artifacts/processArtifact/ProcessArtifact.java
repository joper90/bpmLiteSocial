
package artifacts.processArtifact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
import org.ektorp.support.CouchDbDocument;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "docType",
    "process",
    "fields"
})
public class ProcessArtifact extends CouchDbDocument{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("docType")
    private String docType;
    @JsonProperty("process")
    private Process process;
    @JsonProperty("fields")
    private List<Field> fields = new ArrayList<Field>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("process")
    public Process getProcess() {
        return process;
    }

    @JsonProperty("process")
    public void setProcess(Process process) {
        this.process = process;
    }

    @JsonProperty("fields")
    public List<Field> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Field> fields) {
        this.fields = fields;
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
