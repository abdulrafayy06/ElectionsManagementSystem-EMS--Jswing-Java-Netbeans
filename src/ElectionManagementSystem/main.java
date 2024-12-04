package ElectionManagementSystem;

import java.util.ArrayList;

public class main {

    // Declare ArrayList as a class member variable
    public static ResultTabulationOverall ResultsTabulation;
    public static ElectionControl electionscontrol;
    public static ArrayList<ElectionNews> electionsnews;
    public static ArrayList<Voter> voters;
    public static ArrayList<Candidate> candidates;
    public static ArrayList<Constituency> constituencys;
    private static Administrator admin;

    public static void main(String[] args) {

        //for results
        ResultsTabulation = new ResultTabulationOverall("Not Started", "Not Started", "Not Ended", "Not Ended");

        // Initialize the ArrayLists inside the main method
        //elections control object
        electionscontrol = new ElectionControl(false);

        //election news arrays of objects
        electionsnews = new ArrayList<>();
        electionsnews.add(new ElectionNews("Dear Voter! cast your vote without any pressure."));

        //initilizing voters
        voters = new ArrayList<>();
        voters.add(new Voter("Abdul Rafay", "4444444444444", "NA-58", "PP-21"));
        voters.add(new Voter("Shahzain", "5555555555555", "NA-58", "PP-22"));
        voters.add(new Voter("Zainab Bibi", "6666666666666", "NA-58", "PP-21"));
        voters.add(new Voter("Zain Ul Abdeen", "3333333333333", "NA-58", "PP-22"));
        voters.add(new Voter("Bilawal Sharjeel", "1111111111111", "NA-58", "PP-21"));
        voters.add(new Voter("Rafay Khan", "2222222222222", "NA-58", "PP-21"));

        //initilizing constituencies
        constituencys = new ArrayList<>();
        constituencys.add(new Constituency("NA-58", "PP-21"));
        constituencys.add(new Constituency("NA-58", "PP-22"));
        constituencys.add(new Constituency("NA-59", "PP-23"));

        //initilizing candidates
        candidates = new ArrayList<>();
        candidates.add(new Candidate("Ayaz Ameer", "1111111111111", "Pakistan Tehreek-e-Insaf (PTI)", "NA-58"));
        candidates.add(new Candidate("Major Tahir Iqbal", "2222222222222", "Pakistan Muslim League (Nawaz) (PML-N)", "NA-58"));
        candidates.add(new Candidate("Iftikhar Ahmed", "3333333333333", "Jamaat-e-Islami Pakistan (JIP)", "NA-58"));
        candidates.add(new Candidate("Sardar Zulfiqar", "4444444444444", "Pakistan Peoples Party (PPP)", "NA-58"));
        candidates.add(new Candidate("Raja Sohail", "5555555555555", "Tehreek-e-Labaik Pakistan (TLP)", "NA-58"));
        candidates.add(new Candidate("Tariq Mehmood", "6666666666666", "Pakistan Tehreek-e-Insaf (PTI)", "PP-21"));
        candidates.add(new Candidate("Tanveer Aslam", "7777777777777", "Pakistan Muslim League (Nawaz) (PML-N)", "PP-21"));
        candidates.add(new Candidate("Nuzhat Iqbal", "8888888888888", "Jamaat-e-Islami Pakistan (JIP)", "PP-21"));
        candidates.add(new Candidate("Raja Amjad ", "9999999999999", "Pakistan Peoples Party (PPP)", "PP-21"));
        candidates.add(new Candidate("Hafiz Muhammad", "1010101010101", "Tehreek-e-Labaik Pakistan (TLP)", "PP-21"));
        candidates.add(new Candidate("Nisar Ahmed", "6666666666666", "Pakistan Tehreek-e-Insaf (PTI)", "PP-22"));
        candidates.add(new Candidate("Sardar Ghulam ", "7777777777777", "Pakistan Muslim League (Nawaz) (PML-N)", "PP-22"));
        candidates.add(new Candidate("Muhammad Tahir", "8888888888888", "Jamaat-e-Islami Pakistan (JIP)", "PP-22"));
        candidates.add(new Candidate("Nisar Ahmed ", "9999999999999", "Pakistan Peoples Party (PPP)", "PP-22"));
        candidates.add(new Candidate("Muhammad Idrees", "1010101010101", "Tehreek-e-Labaik Pakistan (TLP)", "PP-22"));

        admin = new Administrator("admin", "admin");

        // Use invokeLater to ensure GUI creation is on the EDT
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Method to access the admin instance
    public static Administrator getAdmin() {
        return admin;
    }

}