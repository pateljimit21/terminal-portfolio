public class Portfolio{
    public static void main(String[] args) {

        String name = "Jimit Patel";
        String role = "Software Engineer";

        String app = "Terminal Portfolio";
        final String version = "0.1";

        int startYear = 2025;
        int startMonth = 7;
        int currentYear = 2026;
        int currentMonth = 11;
        double experience = (((currentYear - startYear) * 12) + (currentMonth - startMonth)) / 12.0;

        int topicsDone = 2;
        int totalTopics = 12;
        double percentComplete = (topicsDone * 100 / totalTopics);
        
        boolean openToWork = true;

        System.out.println("==================================================");
        System.out.println(name.toUpperCase() + " | " + role);
        System.out.println(app + " v" + version);
        System.out.println("==================================================");
        System.out.printf("Experience: %.1f years%n", experience);
        System.out.printf("Java roadmap: %.0f%% complete (%d/%d topics)", percentComplete, topicsDone, totalTopics);
        System.out.println("Open to work: " + openToWork);
        System.out.println("==================================================");
        System.out.println("Type '/help' to get started.");
    }
}