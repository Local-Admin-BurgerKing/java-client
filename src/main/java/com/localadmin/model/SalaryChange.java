/*
 * rest-api
 * An api to fetch manipulate and enter data to the Local Admin service. All Responses can be done with JSON and XML where JSON is the default. You can change the response by setting the content-type header. The downside of our XML is that we do not provide XLS for the Responses
 *
 * OpenAPI spec version: 1.1.0
 * Contact: nbrugger@student.tgm.ac.at
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.localadmin.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.time.LocalDate;
import java.io.Serializable;
/**
 * A Change in the salary history. Defines a timestamp at which the salary for a salary level changed
 */
@Schema(description = "A Change in the salary history. Defines a timestamp at which the salary for a salary level changed")

public class SalaryChange implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("value")
  private Integer value = null;

  public SalaryChange date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date where the change took place
   * @return date
  **/
  @Schema(required = true, description = "The date where the change took place")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public SalaryChange value(Integer value) {
    this.value = value;
    return this;
  }

   /**
   * The new salary level in cents per hour
   * minimum: 0
   * @return value
  **/
  @Schema(required = true, description = "The new salary level in cents per hour")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalaryChange salaryChange = (SalaryChange) o;
    return Objects.equals(this.date, salaryChange.date) &&
        Objects.equals(this.value, salaryChange.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalaryChange {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
