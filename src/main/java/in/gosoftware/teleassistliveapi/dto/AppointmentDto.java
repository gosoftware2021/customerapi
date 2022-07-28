package in.gosoftware.teleassistliveapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;



@Getter
@Setter
@Data

@NoArgsConstructor

public class AppointmentDto {




            @NotNull(message = "Company Id is missing")
            private String cmpid;
            @NotNull(message = "Customer Name is Missing")
            private String customer_name;
            private String customer_location;
            @NotNull(message = "Customer Mobile no is Missing")
            private String customer_mob_no;
            private String customer_whatsapp_no;
            private String team_name;

            private String member_name;
            @NotNull(message = "Appointment Date is Missing")
            private String appointment_date_time;
            private String appointment_purpose;
            private String appointment_remarks;
            private String appointment_status;


}
