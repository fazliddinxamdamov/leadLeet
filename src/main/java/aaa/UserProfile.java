package aaa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserProfile {

    private String firstName;
    private String lastName;
    private String middleName;

}
