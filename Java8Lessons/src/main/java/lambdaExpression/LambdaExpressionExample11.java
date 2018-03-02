package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Goods {
	int id;
	String name;
	float price;

	public Goods(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class LambdaExpressionExample11 {
	public static void main(String[] args) {
		List<Goods> list = new ArrayList<Goods>();
		list.add(new Goods(1, "Samsung A5", 17000f));
		list.add(new Goods(3, "Iphone 6S", 65000f));
		list.add(new Goods(2, "Sony Xperia", 25000f));
		list.add(new Goods(4, "Nokia Lumia", 15000f));
		list.add(new Goods(5, "Redmi4 ", 26000f));
		list.add(new Goods(6, "Lenevo Vibe", 19000f));

		// using lambda to filter data
		Stream<Goods> filtered_data = list.stream().filter(p -> p.price > 20000);

		// using lambda to iterate through collection
		filtered_data.forEach(product -> System.out.println(product.name + ": " + product.price));
	}
}
