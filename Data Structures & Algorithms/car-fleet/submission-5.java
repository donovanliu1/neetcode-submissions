class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    Stack<Double> fleets = new Stack();
    int[][] cars = new int[position.length][1];
    for (int r = 0; r < position.length; r++){
        // for (int c = 0; c < 2; c++){
        cars[r] = new int[]{position[r], speed[r]};
        // }
    }
    Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));
    double[] times = new double[position.length];
    for (int i = 0; i < position.length; i++){
        times[i] = (double) (target - cars[i][0]) / cars[i][1];
    }
    for (int i = 0; i < times.length; i++){
        if (fleets.empty() || fleets.peek() < times[i]) fleets.push(times[i]);
    }
    return fleets.size();
}
}
