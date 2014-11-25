import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {

	public void createTable() {
		// 可以验证生成表是否正确
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("wechat");
		factory.close();
	}
	public static void main(String[] args) {
		Test t =new Test();
		t.createTable();

	}

}
