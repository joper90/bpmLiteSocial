
package artifacts.workItemKeyDetails;

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
    "processId",
    "worked",
    "stepId",
    "uniqueFormGuid",
    "userKey",
    "rootKey",
    "displayOnly",
    "orderList",
    "callBackGuid",
    "keyFieldDetails"
})
public class WorkItemKeyDetails {

    @JsonProperty("docType")
    private String docType;
    @JsonProperty("processId")
    private String processId;
    @JsonProperty("worked")
    private String worked;
    @JsonProperty("stepId")
    private String stepId;
    @JsonProperty("uniqueFormGuid")
    private String uniqueFormGuid;
    @JsonProperty("userKey")
    private String userKey;
    @JsonProperty("rootKey")
    private String rootKey;
    @JsonProperty("displayOnly")
    private String displayOnly;
    @JsonProperty("orderList")
    private String orderList;
    @JsonProperty("callBackGuid")
    private String callBackGuid;
    @JsonProperty("keyFieldDetails")
    private KeyFieldDetails keyFieldDetails;
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

    @JsonProperty("worked")
    public String getWorked() {
        return worked;
    }

    @JsonProperty("worked")
    public void setWorked(String worked) {
        this.worked = worked;
    }

    @JsonProperty("stepId")
    public String getStepId() {
        return stepId;
    }

    @JsonProperty("stepId")
    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    @JsonProperty("uniqueFormGuid")
    public String getUniqueFormGuid() {
        return uniqueFormGuid;
    }

    @JsonProperty("uniqueFormGuid")
    public void setUniqueFormGuid(String uniqueFormGuid) {
        this.uniqueFormGuid = uniqueFormGuid;
    }

    @JsonProperty("userKey")
    public String getUserKey() {
        return userKey;
    }

    @JsonProperty("userKey")
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    @JsonProperty("rootKey")
    public String getRootKey() {
        return rootKey;
    }

    @JsonProperty("rootKey")
    public void setRootKey(String rootKey) {
        this.rootKey = rootKey;
    }

    @JsonProperty("displayOnly")
    public String getDisplayOnly() {
        return displayOnly;
    }

    @JsonProperty("displayOnly")
    public void setDisplayOnly(String displayOnly) {
        this.displayOnly = displayOnly;
    }

    @JsonProperty("orderList")
    public String getOrderList() {
        return orderList;
    }

    @JsonProperty("orderList")
    public void setOrderList(String orderList) {
        this.orderList = orderList;
    }

    @JsonProperty("callBackGuid")
    public String getCallBackGuid() {
        return callBackGuid;
    }

    @JsonProperty("callBackGuid")
    public void setCallBackGuid(String callBackGuid) {
        this.callBackGuid = callBackGuid;
    }

    @JsonProperty("keyFieldDetails")
    public KeyFieldDetails getKeyFieldDetails() {
        return keyFieldDetails;
    }

    @JsonProperty("keyFieldDetails")
    public void setKeyFieldDetails(KeyFieldDetails keyFieldDetails) {
        this.keyFieldDetails = keyFieldDetails;
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
