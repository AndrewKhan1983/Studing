package lesson13_1;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {


        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(a);

        for (Integer e : b) {
            if (!union.contains(e)) ;
            union.add(e);


        }
        return union;
    }
    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> intersection = new LinkedList<>();
        for (Integer num : a) {
            if (b.contains(num)) {
                intersection.add(num);
            }
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersection.add(num);
            }
        }
        return intersection;
    }
    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> nu = new LinkedHashSet<>(a);
        nu.addAll(b);
        List<Integer> finnum = new LinkedList<>(nu);

        return nu;
    }
    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        Set<Integer> intersectionWithoutDuplicate = new LinkedHashSet<>();
        for (Integer num : a) {
            if (b.contains(num)) ;
            intersectionWithoutDuplicate.add(num);
        }
        for (Integer num : b) {
            if (a.contains(num)) {
                intersectionWithoutDuplicate.add(num);
            }
        }
        return intersectionWithoutDuplicate;
    }
    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> difference = new LinkedList<>();
        for (Integer num : a) {
            if (!b.contains(num)) {
                difference.add(num);
            }
        }
        for (Integer num : b) {
            if (!a.contains(num)) {
                difference.add(num);
            }
        }
        return difference;
    }
}


// изменения
