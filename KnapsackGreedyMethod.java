import java.util.Scanner;

public class KnapsackGreedyMethod {

	float knapsack(float capacity, float[] value, float[] weight) {

		float[] ratio = new float[weight.length];
		for (int i = 0; i < weight.length; i++) {
			ratio[i] = value[i] / weight[i];
		}

		for (int i = 0; i < ratio.length; i++) {
			for (int j = i + 1; j < ratio.length; j++) {
				if (ratio[i] < ratio[j]) {
					float tempRatio = ratio[i];
					ratio[i] = ratio[j];
					ratio[j] = tempRatio;

					float tempWeight = weight[i];
					weight[i] = weight[j];
					weight[j] = tempWeight;

					float tempValue = value[i];
					value[i] = value[j];
					value[j] = tempValue;
				}
			}
		}

		float maxValue = 0.0f;
		float currentWeight = 0.0f;

		for (int i = 0; i < weight.length; i++) {
			if (currentWeight + weight[i] <= capacity) {
				maxValue += value[i];
				currentWeight += weight[i];
			} else {
				float remainingCapacity = capacity - currentWeight;
				maxValue +=  (remainingCapacity * ratio[i]);
				break;
			}
		}

		return maxValue;
	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of objects: ");
		int n = sc.nextInt();
		System.out.println("Enter the capacity: ");
		float capacity = sc.nextFloat();
		System.out.println("Enter the Profit and weight: ");

		float P[] = new float[n];
		float W[] = new float[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " object profit and weight:");
			P[i] = sc.nextFloat();
			W[i] = sc.nextFloat();
		}
		KnapsackGreedyMethod k1=new KnapsackGreedyMethod();
		System.out.println("Maximum profit is"+k1.knapsack(capacity, P, W));

	}

}
