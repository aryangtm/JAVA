public static List<Long> getMaxArea(int w, int h, List<Boolean> isVertical, List<Integer> distance) {
    List<Long> result = new ArrayList<>();
        
        // Use TreeSet for O(log n) insertions while maintaining sorted order
        TreeSet<Integer> horizontalCuts = new TreeSet<>();
        TreeSet<Integer> verticalCuts = new TreeSet<>();
        
        // Add boundaries to simplify gap calculations
        horizontalCuts.add(0);
        horizontalCuts.add(h);
        verticalCuts.add(0);
        verticalCuts.add(w);
        
        // Track maximum gaps
        long maxHorizontalGap = h;
        long maxVerticalGap = w;
        
        // Process each boundary
        for (int i = 0; i < isVertical.size(); i++) {
            boolean isVert = isVertical.get(i);
            int dist = distance.get(i);
            
            if (isVert) {
                // If this cut already exists, no change to the maximum area
                if (!verticalCuts.contains(dist)) {
                    // Find adjacent cuts
                    Integer lowerCut = verticalCuts.lower(dist);
                    Integer higherCut = verticalCuts.higher(dist);
                    
                    // Add the new cut
                    verticalCuts.add(dist);
                    
                    // Current gap being split
                    long currentGap = higherCut - lowerCut;
                    
                    // If we're splitting the maximum gap, we need to recalculate
                    if (currentGap == maxVerticalGap) {
                        // New gaps after splitting
                        long newGap1 = dist - lowerCut;
                        long newGap2 = higherCut - dist;
                        
                        // Find the new maximum gap by comparing all gaps
                        maxVerticalGap = Math.max(newGap1, newGap2);
                        
                        // If neither new gap equals the old max, scan through all gaps
                        if (maxVerticalGap < currentGap) {
                            // We need to find the new maximum gap
                            Integer prev = null;
                            for (Integer cut : verticalCuts) {
                                if (prev != null) {
                                    maxVerticalGap = Math.max(maxVerticalGap, cut - prev);
                                }
                                prev = cut;
                            }
                        }
                    }
                }
            } else {
                // If this cut already exists, no change to the maximum area
                if (!horizontalCuts.contains(dist)) {
                    // Find adjacent cuts
                    Integer lowerCut = horizontalCuts.lower(dist);
                    Integer higherCut = horizontalCuts.higher(dist);
                    
                    // Add the new cut
                    horizontalCuts.add(dist);
                    
                    // Current gap being split
                    long currentGap = higherCut - lowerCut;
                    
                    // If we're splitting the maximum gap, we need to recalculate
                    if (currentGap == maxHorizontalGap) {
                        // New gaps after splitting
                        long newGap1 = dist - lowerCut;
                        long newGap2 = higherCut - dist;
                        
                        // Find the new maximum gap by comparing all gaps
                        maxHorizontalGap = Math.max(newGap1, newGap2);
                        
                        // If neither new gap equals the old max, scan through all gaps
                        if (maxHorizontalGap < currentGap) {
                            // We need to find the new maximum gap
                            Integer prev = null;
                            for (Integer cut : horizontalCuts) {
                                if (prev != null) {
                                    maxHorizontalGap = Math.max(maxHorizontalGap, cut - prev);
                                }
                                prev = cut;
                            }
                        }
                    }
                }
            }
            
            // Add the current maximum area to the result
            result.add(maxHorizontalGap * maxVerticalGap);
        }
        
        return result;

    }
