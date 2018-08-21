class MovingAverage {

    /** Initialize your data structure here. */
    int size;
    Queue<Integer> cache = new LinkedList<>();
    double sum = 0.0;
    double average = 0.0;
    public MovingAverage(int size) {
        this.size = size;
    }
    
    public double next(int val) {
        sum += val;
        cache.add(val);
        if (cache.size() <= size)
            return sum/cache.size();
        else{
            sum -= cache.poll();
            return sum/cache.size();
        }
        
        
    }
}
