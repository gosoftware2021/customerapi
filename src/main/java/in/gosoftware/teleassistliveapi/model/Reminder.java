package in.gosoftware.teleassistliveapi.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
public class Reminder {
       @Id
       @GeneratedValue(strategy = GenerationType.AUTO)
           private Long id;

           private String customer_name;
           private String customer_location;

           private String customer_mob_no;
           private String customer_whatsapp_no;
           private String team_name;
           private String member_name;

           private String reminder_date_time;
           private String reminder_remarks;
           private String reminder_status;
}
