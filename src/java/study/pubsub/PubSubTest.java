
public class PubSubTest {

	public static void main(String[] args) {

		MyPublisher pub = new MyPublisher();
		MySubscriber sub = new MySubscriber();

		pub.subscribe(sub);
	}

}
