import java.util.*;


public class Collections {

    // ATTRIBUTES
    public List<String> list;
    public Set<String> set;
    public Map<String, String> map;
    public TreeSet<String> tree;
    String[] sports = {
            "Baseball",
            "Basketball",
            "Hockey",
            "League"
    };

    public void runList() {
        list = new ArrayList<>();

        list.add("CS:GO");
        list.add("Football");
        list.add("Football"); // List allows for duplicates, so this will work
        list.add("MotoCross");
        Collections.addAll(list, sports);

        System.out.println("LIST:\nBefore removal: ");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        list.removeAll(Arrays.asList(sports));

        System.out.println("\nAfter removal: ");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

    public void runSet() {
        set = new HashSet<>();

        set.add("CS:GO");
        set.add("Football");
        set.add("Football"); // Set prevents duplicates, Football will still only show up once
        set.add("MotoCross");
        Collections.addAll(set, sports);

        System.out.println("\n\nSET:\nBefore removal: ");
        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        set.removeAll(Arrays.asList(sports));

        System.out.println("\nAfter removal: ");
        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

    public void runMap() {
        map = new HashMap<>();

        map.put("CS:GO", "cout << \"Hello world!\";");
        map.put("Football", "System.out.println(\"Hello world!\");");
        map.put("MotoCross", "print(\"Hello world!\")");

        Map<String, String> webDevForMap = new HashMap<>();
        webDevForMap.put("Baseball", "echo 'Hello world!';");
        webDevForMap.put("Basketball", "<div>Hello world!</div>");
        webDevForMap.put("Hockey", "window.alert('Hello world!');");
        webDevForMap.put("League", "puts \"Hello world!\"");
        map.putAll(webDevForMap);

        System.out.println("\n\nMAP:\nBefore removal: ");
        for (Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(String.format("%s: %s", pair.getKey(), pair.getValue()));
        }

        map.remove("Baseball");
        map.remove("Basketball");
        map.remove("Hockey");
        map.remove("League");

        System.out.println("\nAfter removal: ");
        for (Iterator it = map.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println(String.format("%s: %s", pair.getKey(), pair.getValue()));
        }
    }

    public void runTree() {
        tree = new TreeSet<>();

        tree.add("CS:GO");
        tree.add("Football");
        tree.add("Football"); // Set prevents duplicates, Football will still only show up once
        tree.add("MotoCross");
        Collections.addAll(tree, sports);

        System.out.println("\n\nTREE:\nBefore removal: ");
        for (Iterator<String> it = tree.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

        tree.removeAll(Arrays.asList(sports));

        System.out.println("\nAfter removal: ");
        for (Iterator<String> it = tree.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

    public void run() {
        runList();
        runSet();
        runMap();
        runTree();
    }

    public static void main(String[] args) {
        new CollectionTesting().run();
    }
}
