package i_o_strean_transientAtt_6C;

import java.io.Serializable;

public class Marksheet implements Serializable {
	public String name=null;
	public int maths=0;
	public int physics=0;
	public int Chemistry=0;
	public transient int total;
	public transient double percentage=0;
	

}
