public class NotebookShop {
    static void main(String[] args) {
        DataStore dataStore = new DataStore();


        dataStore.add(new Computer("Dell",4321));
        dataStore.add(new Computer("Dell",4321));
        dataStore.add(new Computer("Asus",3214));
        dataStore.add(new Computer("MacBook",2344));
        dataStore.add(new Computer("Dell",4321));


        dataStore.showComputers();
        dataStore.checkAvailability(dataStore.getComputers()[2]);
    }
}
