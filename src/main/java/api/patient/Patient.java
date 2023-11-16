package api.patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
public class Patient {

    private String name;
    private String disease;
    private int age;
    private int billPay;

    public Patient() {

    }
}
