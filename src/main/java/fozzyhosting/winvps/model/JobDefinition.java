/*
 * Fozzy Windows VPS resellers API
 *  Application Programming Interface (API) allows clients to manage the Windows VPS machines lifecycle.  ## Endpoint  `https://winvps.fozzy.com/api/v2/`  ## Authentication  To access the API, an existing client of Fozzy Inc. should be registered as Windows VPS Reseller by the company tech support through the ticket or using Sales Email. After that, the client will have an access to the winvps.fozzy.com and will be able to get an API Token (Signature) in `Settings -> API` section of main menu.  If you have already used the previous API version, then the token is known to you.  Note that the Token grants full access to your account and should be protected the same way you would protect your password. Also you can reset the Token on the receipt page.  To use the Token you should pass it to `Api-Key` header of each request like this:  ` curl -H 'API-KEY: TOKEN' https://winvps.fozzy.com/api/v2/products `  ## Content-Type  API v2 supports `application/json`, `application/x-www-form-urlencoded` and `multipart/form-data` content types.  In the first case HTTP request must be JSON-encoded with the body as a valid JSON string. The othres are default POST types with content in key=value format.  The response always has `application/json` type and contains JSON-encoded payload.  ## Response  A successful response will be returned as a JSON object with at least one of the following top-level members: - `data` - the document’s “primary data” - `error` - error message - `pagination` - pagination details  The members data and error cannot coexist in the same document.  ### Codes   - `200 OK` - Everything worked as expected.  - `201 Created` - The request was successful and a resource was created. This is typically a response from a POST request to create a resource which runs immediately.  - `202 Accepted` - The request has been accepted for processing. This is typically a response from a POST request that is handled async in our system, such as a request for some machine command.  - `204 No Content` - The request was successful but the response body is empty. This is typically a response from a DELETE request to delete a resource or cancel the command.  - `400 Bad Request` - A required parameter or the request is invalid.  - `403 Unauthorized` - The authentication credentials are invalid.  - `404 Not Found` - The requested resource doesn’t exist.  - `500 Server error` - something went wrong. Please contact our support team.  ### Examples  #### Error:  ```json {   \"error\": \"Error message\" } ```  #### Success - retrieve single record:  ```json {   \"data\": {     \"id\": 1,     \"name\": \"String\"   } } ```   #### Success - retrieve multiple records:  ```json {   \"data\": [     {       \"id\": 1,       \"name\": \"String\"     }, {       \"id\": 2,       \"name\": \"String\"     }   ],   \"pagination\": {     \"total\": 10,   } } ```  #### Success - response for some delayed action:  ```json {   \"data\": {     \"name\": \"String\",     \"jobs\": [       {         \"id\": 0,         \"parent_id\": 0,         \"machine_id\": 0,         \"type\": \"string\",         \"status\": \"string\",         \"start_time\": \"string\"       }     ]   } } ```  ## Pagination  Any API endpoint that returns a list of items requires pagination. By default we will return `50` records from any listing endpoint.  If an API endpoint returns a list of items, then it will include an additional object with pagination information.  The pagination information contains the following details:   - `total` - The total number of entries available in the entire collection  - `limit` - The number of entries returned per page (default: 50)  - `page` - The page currently returned (default: 1)  - `pages` - The total number of pages  To go through the pages you need to pass additional GET parameter `page` with the number of page wanted.  ## Entities meaning  ### Product  A product is a resources set with which a VPS will be created by default. This is a resources such ads CPU cores count, CPU power in percents of the maximum available limit, RAM minimum and maximum values, Disk Size etc.  ### Template  Template is an operating system version for VPS.  ### Brand  Brand is a set of custom software which installs on the machine automatically. Currently this set can be created only through the request to our administrators.  ### Location  Location is a list of regions in which the new VPS creation is available.  ### Job  Job is a command to perform specific actions on the machine such as creation, starting, changing, terminating, etc. Since most actions cannot be performed instantly, they are all queued and executed one after another. You will receive an additional property `jobs` in your response if any request generates new queue positions.  ### Machine  Machine is a virtual private server (VPS) which used to your own needs. Each Mahine has Operating System defined by **Template** installed on the server in a data center in a country specified by **Location** option. The machine has some specified by **Product** resources which can be used by your software installed automatically by the **Brand** option or manually from the RDP interface. 
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fozzyhosting.winvps.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
* JobDefinition
*/

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-11T18:41:58.477Z[Etc/UTC]")
public class JobDefinition {
        @SerializedName("id")
        private Integer id = null;

        @SerializedName("parent_id")
        private Integer parentId = null;

        @SerializedName("machine_id")
        private Integer machineId = null;

        @SerializedName("type")
        private String type = null;

        @SerializedName("status")
        private String status = null;

        @SerializedName("start_time")
        private String startTime = null;

        public JobDefinition id(Integer id) {
        this.id = id;
        return this;
        }

    /**
        * Job primary ID. Can be used to show Job details or cancel the command
    * @return id
    **/
        @Schema(description = "Job primary ID. Can be used to show Job details or cancel the command")
    public Integer getId() {
    return id;
    }

        public void setId(Integer id) {
        this.id = id;
        }

        public JobDefinition parentId(Integer parentId) {
        this.parentId = parentId;
        return this;
        }

    /**
        * ID of the last Job before the current one. Since the commands are executed sequentially, parent ID can be used to monitor the progress of command processing.
    * @return parentId
    **/
        @Schema(description = "ID of the last Job before the current one. Since the commands are executed sequentially, parent ID can be used to monitor the progress of command processing.")
    public Integer getParentId() {
    return parentId;
    }

        public void setParentId(Integer parentId) {
        this.parentId = parentId;
        }

        public JobDefinition machineId(Integer machineId) {
        this.machineId = machineId;
        return this;
        }

    /**
        * ID of the machine Job created for.
    * @return machineId
    **/
        @Schema(description = "ID of the machine Job created for.")
    public Integer getMachineId() {
    return machineId;
    }

        public void setMachineId(Integer machineId) {
        this.machineId = machineId;
        }

        public JobDefinition type(String type) {
        this.type = type;
        return this;
        }

    /**
        * Defines the command which be executed.
    * @return type
    **/
        @Schema(description = "Defines the command which be executed.")
    public String getType() {
    return type;
    }

        public void setType(String type) {
        this.type = type;
        }

        public JobDefinition status(String status) {
        this.status = status;
        return this;
        }

    /**
        * Command status.
    * @return status
    **/
        @Schema(description = "Command status.")
    public String getStatus() {
    return status;
    }

        public void setStatus(String status) {
        this.status = status;
        }

        public JobDefinition startTime(String startTime) {
        this.startTime = startTime;
        return this;
        }

    /**
        * Time after which the command can be started. The Job will not be started before this time but can be started some time later when the queue reaches its completion.
    * @return startTime
    **/
        @Schema(description = "Time after which the command can be started. The Job will not be started before this time but can be started some time later when the queue reaches its completion.")
    public String getStartTime() {
    return startTime;
    }

        public void setStartTime(String startTime) {
        this.startTime = startTime;
        }


    @Override
    public boolean equals(java.lang.Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        JobDefinition jobDefinition = (JobDefinition) o;
        return Objects.equals(this.id, jobDefinition.id) &&
        Objects.equals(this.parentId, jobDefinition.parentId) &&
        Objects.equals(this.machineId, jobDefinition.machineId) &&
        Objects.equals(this.type, jobDefinition.type) &&
        Objects.equals(this.status, jobDefinition.status) &&
        Objects.equals(this.startTime, jobDefinition.startTime);
    }

    @Override
    public int hashCode() {
    return Objects.hash(id, parentId, machineId, type, status, startTime);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class JobDefinition {\n");

sb.append("    id: ").append(toIndentedString(id)).append("\n");
sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
sb.append("    machineId: ").append(toIndentedString(machineId)).append("\n");
sb.append("    type: ").append(toIndentedString(type)).append("\n");
sb.append("    status: ").append(toIndentedString(status)).append("\n");
sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
sb.append("}");
return sb.toString();
}

/**
* Convert the given object to string with each line indented by 4 spaces
* (except the first line).
*/
private String toIndentedString(java.lang.Object o) {
if (o == null) {
return "null";
}
return o.toString().replace("\n", "\n    ");
}

}
