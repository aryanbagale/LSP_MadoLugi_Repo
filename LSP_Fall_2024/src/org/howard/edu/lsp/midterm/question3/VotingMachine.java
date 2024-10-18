package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
    private Map<String, Integer> candidateVotes;  // Map to hold candidate names and their vote counts

    // Constructor to initialize the voting machine
    public VotingMachine() {
        candidateVotes = new HashMap<>();
    }

    // Method to add a candidate to the voting machine
    public void addCandidate(String candidateName) {
        if (!candidateVotes.containsKey(candidateName)) {
            candidateVotes.put(candidateName, 0);  // Initialize candidate's vote count to 0
        } else {
            System.out.println(candidateName + " is already a candidate.");
        }
    }

    // Method to cast a vote for a candidate
    public void castVote(String candidateName) {
        if (candidateVotes.containsKey(candidateName)) {
            candidateVotes.put(candidateName, candidateVotes.get(candidateName) + 1);  // Increment vote count
        } else {
            System.out.println("Candidate " + candidateName + " does not exist.");
        }
    }

    // Override toString() method to display the votes each candidate has received
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidateVotes.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }

    // Main method to test the VotingMachine class
    public static void main(String[] args) {
        VotingMachine votingMachine = new VotingMachine();
        votingMachine.addCandidate("Alsobrooks");
        votingMachine.castVote("Alsobrooks");
        votingMachine.addCandidate("Hogan");
        System.out.println(votingMachine.toString());
    }
}
