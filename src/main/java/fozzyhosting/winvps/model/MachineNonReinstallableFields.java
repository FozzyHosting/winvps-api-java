/*
 * Fozzy Windows VPS resellers API
 *  Application Programming Interface (API) allows clients to manage the Windows VPS machines lifecycle.  ## Endpoint  `https://winvps.fozzy.com/api/v2/`  ## Authentication  To access the API, an existing client of Fozzy Inc. should be registered as Windows VPS Reseller by the company tech support through the ticket or using Sales Email. After that, the client will have an access to the winvps.fozzy.com and will be able to get an API Token (Signature) in `Settings -> API` section of main menu.  If you have already used the previous API version, then the token is known to you.  Note that the Token grants full access to your account and should be protected the same way you would protect your password. Also you can reset the Token on the receipt page.  To use the Token you should pass it to `Api-Key` header of each request like this:  ` curl -H 'API-KEY: TOKEN' https://winvps.fozzy.com/api/v2/products `  ## Content-Type  API v2 supports `application/json`, `application/x-www-form-urlencoded` and `multipart/form-data` content types.  In the first case HTTP request must be JSON-encoded with the body as a valid JSON string. The othres are default POST types with content in key=value format.  The response always has `application/json` type and contains JSON-encoded payload.  ## Response  A successful response will be returned as a JSON object with at least one of the following top-level members: - `data` - the document’s “primary data” - `error` - error message - `pagination` - pagination details  The members data and error cannot coexist in the same document.  ### Codes   - `200 OK` - Everything worked as expected.  - `201 Created` - The request was successful and a resource was created. This is typically a response from a POST request to create a resource which runs immediately.  - `202 Accepted` - The request has been accepted for processing. This is typically a response from a POST request that is handled async in our system, such as a request for some machine command.  - `204 No Content` - The request was successful but the response body is empty. This is typically a response from a DELETE request to delete a resource or cancel the command.  - `400 Bad Request` - A required parameter or the request is invalid.  - `403 Unauthorized` - The authentication credentials are invalid.  - `404 Not Found` - The requested resource doesn’t exist.  - `500 Server error` - something went wrong. Please contact our support team.  ### Examples  #### Error:  ```json {   \"error\": \"Error message\" } ```  #### Success - retrieve single record:  ```json {   \"data\": {     \"id\": 1,     \"name\": \"String\"   } } ```   #### Success - retrieve multiple records:  ```json {   \"data\": [     {       \"id\": 1,       \"name\": \"String\"     }, {       \"id\": 2,       \"name\": \"String\"     }   ],   \"pagination\": {     \"total\": 10,   } } ```  #### Success - response for some delayed action:  ```json {   \"data\": {     \"name\": \"String\",     \"jobs\": [       {         \"id\": 0,         \"parent_id\": 0,         \"machine_id\": 0,         \"type\": \"string\",         \"status\": \"string\",         \"start_time\": \"string\"       }     ]   } } ```  ## Pagination  Any API endpoint that returns a list of items requires pagination. By default we will return `50` records from any listing endpoint.  If an API endpoint returns a list of items, then it will include an additional object with pagination information.  The pagination information contains the following details:   - `total` - The total number of entries available in the entire collection  - `limit` - The number of entries returned per page (default: 50)  - `page` - The page currently returned (default: 1)  - `pages` - The total number of pages  To go through the pages you need to pass additional GET parameter `page` with the number of page wanted.  ## Entities meaning  ### Product  A product is a resources set with which a VPS will be created by default. This is a resources such ads CPU cores count, CPU power in percents of the maximum available limit, RAM minimum and maximum values, Disk Size etc.  ### Template  Template is an operating system version for VPS.  ### Brand  Brand is a set of custom software which installs on the machine automatically. Currently this set can be created only through the request to our administrators.  ### Location  Location is a list of regions in which the new VPS creation is available.  ### Job  Job is a command to perform specific actions on the machine such as creation, starting, changing, terminating, etc. Since most actions cannot be performed instantly, they are all queued and executed one after another. You will receive an additional property `jobs` in your response if any request generates new queue positions.  ### Machine  Machine is a virtual private server (VPS) which used to your own needs. Each Mahine has Operating System defined by **Template** installed on the server in a data center in a country specified by **Location** option. The machine has some specified by **Product** resources which can be used by your software installed automatically by the **Brand** option or manually from the RDP interface.  ## Changelog  ### Version 2.1.0  Added new command `run_updates_install` for starting Windows updates installation. Command can be used in the *_/machines/{name}/{command}* request.  The status of updates is displayed in the general information about the machine by the *_/machines/{name}* request. 
 *
 * OpenAPI spec version: 2.1.0
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
* MachineNonReinstallableFields
*/

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-12-28T17:32:07.749Z[Etc/UTC]")
public class MachineNonReinstallableFields {
              /**
               * Server disk type. HDD or SSD.
               */
              @JsonAdapter(DiskTypeEnum.Adapter.class)
              public enum DiskTypeEnum {
                HDD("hdd"),
                SSD("ssd");
            
                private String value;
            
                DiskTypeEnum(String value) {
                  this.value = value;
                }
                public String getValue() {
                  return value;
                }
            
                @Override
                public String toString() {
                  return String.valueOf(value);
                }
                public static DiskTypeEnum fromValue(String text) {
                  for (DiskTypeEnum b : DiskTypeEnum.values()) {
                    if (String.valueOf(b.value).equals(text)) {
                      return b;
                    }
                  }
                  return null;
                }
                public static class Adapter extends TypeAdapter<DiskTypeEnum> {
                  @Override
                  public void write(final JsonWriter jsonWriter, final DiskTypeEnum enumeration) throws IOException {
                    jsonWriter.value(enumeration.getValue());
                  }
            
                  @Override
                  public DiskTypeEnum read(final JsonReader jsonReader) throws IOException {
                    String value = jsonReader.nextString();
                    return DiskTypeEnum.fromValue(String.valueOf(value));
                  }
                }
              }        @SerializedName("disk_type")
        private DiskTypeEnum diskType = null;

        @SerializedName("location_id")
        private Integer locationId = null;

        public MachineNonReinstallableFields diskType(DiskTypeEnum diskType) {
        this.diskType = diskType;
        return this;
        }

    /**
        * Server disk type. HDD or SSD.
    * @return diskType
    **/
        @Schema(description = "Server disk type. HDD or SSD.")
    public DiskTypeEnum getDiskType() {
    return diskType;
    }

        public void setDiskType(DiskTypeEnum diskType) {
        this.diskType = diskType;
        }

        public MachineNonReinstallableFields locationId(Integer locationId) {
        this.locationId = locationId;
        return this;
        }

    /**
        * Primary Location ID.
    * @return locationId
    **/
        @Schema(description = "Primary Location ID.")
    public Integer getLocationId() {
    return locationId;
    }

        public void setLocationId(Integer locationId) {
        this.locationId = locationId;
        }


    @Override
    public boolean equals(java.lang.Object o) {
    if (this == o) {
    return true;
    }
    if (o == null || getClass() != o.getClass()) {
    return false;
    }
        MachineNonReinstallableFields machineNonReinstallableFields = (MachineNonReinstallableFields) o;
        return Objects.equals(this.diskType, machineNonReinstallableFields.diskType) &&
        Objects.equals(this.locationId, machineNonReinstallableFields.locationId);
    }

    @Override
    public int hashCode() {
    return Objects.hash(diskType, locationId);
    }


@Override
public String toString() {
StringBuilder sb = new StringBuilder();
sb.append("class MachineNonReinstallableFields {\n");

sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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
