package pdp.uz.lesson6.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryServiceDto {
    private Integer id;

    private String name;
}
