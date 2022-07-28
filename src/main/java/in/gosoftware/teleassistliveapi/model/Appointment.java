package in.gosoftware.teleassistliveapi.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "appointment")
@Getter
@Setter
@Data

@NoArgsConstructor

public class Appointment {


            @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
            private Long id;

            private String cmpid;

            private String customer_name;
            private String customer_location;

            private String customer_mob_no;
            private String customer_whatsapp_no;
            private String team_name;

            private String member_name;

            private String appointment_date_time;
            private String appointment_purpose;
            private String appointment_remarks;
            private String appointment_status;


}
