
package artifacts.startCaseDetails;

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
    "processId",
    "callBackGuid",
    "caseId",
    "requireCallback",
    "startFields"
})
public class StartCaseDetails extends CouchDbDocument {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("docType")
    private String docType;
    @JsonProperty("processId")
    private String processId;
    @JsonProperty("callBackGuid")
    private String callBackGuid;
    @JsonProperty("caseId")
    private String caseId;
    @JsonProperty("requireCallback")
    private Boolean requireCallback;
    @JsonProperty("startFields")
    private List<StartField> startFields = new ArrayList<StartField>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("docType")
    public String getDocType() {
        return docType;
    }

    @JsonProperty("docType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    @JsonProperty("processId")
    public String getProcessId() {
        return processId;
    }

    @JsonProperty("processId")
    public void setProcessId(String processId) {
        this.processId = processId;
    }

    @JsonProperty("callBackGuid")
    public String getCallBackGuid() {
        return callBackGuid;
    }

    @JsonProperty("callBackGuid")
    public void setCallBackGuid(String callBackGuid) {
        this.callBackGuid = callBackGuid;
    }

    @JsonProperty("caseId")
    public String getCaseId() {
        return caseId;
    }

    @JsonProperty("caseId")
    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    @JsonProperty("requireCallback")
    public Boolean getRequireCallback() {
        return requireCallback;
    }

    @JsonProperty("requireCallback")
    public void setRequireCallback(Boolean requireCallback) {
        this.requireCallback = requireCallback;
    }

    @JsonProperty("startFields")
    public List<StartField> getStartFields() {
        return startFields;
    }

    @JsonProperty("startFields")
    public void setStartFields(List<StartField> startFields) {
        this.startFields = startFields;
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
