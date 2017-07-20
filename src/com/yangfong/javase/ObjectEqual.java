package com.yangfong.javase;

/**
 * Created by Bruce.Jiao on 17-4-12.
 */
public class ObjectEqual {

    @Test
    public void test() {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        System.out.println("o1==o2 ? "+(o1==o2)+" ; o1==o3 ? "+(o1==o3));
        System.out.println("o1.equals(o2) ? "+o1.equals(o2)+" ; o1.equals(o3) ? "+o1.equals(o3));
        Integer i1 = new Integer(12);
        Integer i2 = new Integer(12);
        System.out.println("i1==o2 ? "+(i1==i2)+" ; i1.equals(i2) ? "+i1.equals(i2));
        Short s1 = new Short("17");
        Short s2 = new Short("17");
        System.out.println("s1==s2 ? "+(s1==s2)+" ; s1.equals(s2) ? "+s1.equals(s2));
        Long l1 = new Long("98");
        Long l2 = new Long("98");
        System.out.println("l1==l2 ? "+(l1==l2)+" ; l1.equals(l2) ? "+l1.equals(l2));
        Character c1 = new Character('a');
        Character c2 = new Character('a');
        System.out.println("c1==c2 ? "+(c1==c2)+" ; c1.equals(c2) ? "+c1.equals(c2));
        Float f1 = new Float("12.6");
        Float f2 = new Float("12.6");
        System.out.println("f1==f2 ? "+(f1==f2)+" ; f1.equals(f2) ? "+f1.equals(f2));
        Double d1 = new Double("16.8");
        Double d2 = new Double("16.8");
        System.out.println("d1==d2 ? "+(d1==d2)+" ; d1.equals(d2) ? "+d1.equals(d2));
        Boolean n1 = new Boolean(true);
        Boolean n2 = new Boolean(true);
        System.out.println("n1==n2 ? "+(n1==n2)+" ; n1.equals(n2) ? "+n1.equals(n2));
    }
}
