package in.gosoftware.teleassistliveapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@Getter
@Setter
public class ReminderDto {

           private Long id;
           @NotNull(message = "Customer Name Not found")
           private String customer_name;
           private String customer_location;
           @NotNull(message = "Customer Mobile no. Not found")
           private String customer_mob_no;
           private String customer_whatsapp_no;
           private String team_name;
           private String member_name;
           @NotNull(message = "Customer Reminder Date Not found")
           private String reminder_date_time;
           private String reminder_remarks;
           private String reminder_status;
}
