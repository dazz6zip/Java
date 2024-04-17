package pra02;


//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Data // (lombok 활용)

public class ScoreDto {

	private String name;
	private int kor, eng;

}
