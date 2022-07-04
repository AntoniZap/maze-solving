/*
package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.Main.*;

public class GA {

    private static final int POPULATION_SIZE = 100;
    private static final int ITERATION_NUMBER = 600;
    private static final double MUTATION_CHANCE = 0.01;

    private static final String FINAL_TEXT = "jp2gmd";
    private static final int CHROMOSOME_LENGTH = FINAL_TEXT.length();

    private static List<Cell>[] population =  new List[POPULATION_SIZE];
    private static int[] populationFitness = new int[POPULATION_SIZE];

    private static int maxFitness = 0;
    private static int maxFitnessIndex = 0;
    private static int fitnessesSum;
    private static int minFitness;

    private static List<Cell> getPath(Cell start, int length){
        List<Cell> path = new ArrayList<>();
        path.add(start);

        Cell current = start;
        for (int i = 1; i < length ; i++) {
          List<Cell> directions =  getPossibleDirections(current);
            for (int j = 0; j < directions.size(); j++) {
                if (!maze[directions.get(j).row][directions.get(j).column]){
                    directions.remove(j);
                }
            }
          current = directions.get((int)(Math.random()*directions.size()));
         path.add(current);

        }

        return path;

    }

    public static void main(String[] args) {
        createPopulationZero();
        printPopulation(0);
        calculatePopulationFitness();
        for (int i = 1; i <= ITERATION_NUMBER; i++) {
            reproduce();
            mutate();
            calculatePopulationFitness();
            printPopulation(i);
        }
    }

    private static void reproduce() {
        String[] newPopulation = new String[POPULATION_SIZE];
        newPopulation[0] = population[maxFitnessIndex];
        newPopulation[1] = population[maxFitnessIndex];

        for (int i = 2; i < POPULATION_SIZE; i+=2) {
            String p1 = tournamentSelection();
            String p2 = tournamentSelection();
            String[] children = makeCrossover(p1, p2);
            newPopulation[i] = children[0];
            newPopulation[i+1] = children[1];
        }

        population = newPopulation;
    }

    private static String wheelSelection() {
        double r = Math.random()*fitnessesSum;
        double count = 0;
        for (int i = 0; i < POPULATION_SIZE; i++) {
            count += populationFitness[i];
            if(count >= r){
                return population[i];
            }
        }
        return population[POPULATION_SIZE-1];
    }

    private static String tournamentSelection(){
        int competitors = (int) (Math.random() * 5 + 2);
        int[] indeksy = new int[competitors];
        for (int i = 0; i < competitors; i++) {
            indeksy[i] = (int) (Math.random()*POPULATION_SIZE);
        }
        int maxfitness = 0;
        int maxfitnessindex = 0;
        for (int i = 0; i < indeksy.length; i++) {
            if(populationFitness[indeksy[i]] > maxfitness){
                maxfitness = populationFitness[indeksy[i]];
                maxfitnessindex = indeksy[i];
            }
        }
        return population[maxfitnessindex];
    }

    private static void calculatePopulationFitness() {
        fitnessesSum = 0;
        maxFitness = 0;
        maxFitnessIndex = -1;
        for (int i = 0; i < population.length; i++) {
            int temp = 1;
            for (int j = 0; j < population[i].length(); j++) {
                if(FINAL_TEXT.charAt(j)==population[i].charAt(j)){
                    temp++;
                }
            }
            if(temp > maxFitness){
                maxFitness = temp;
                maxFitnessIndex = i;
            }
            populationFitness[i] = temp;
            fitnessesSum += temp;
        }
    }

    private static String[] makeCrossover(String p1, String p2){
        int random = (int)(Math.random() * (CHROMOSOME_LENGTH - 2) + 1);
        String[] children = new String[2];
        children[0] = p1.substring(0, random) + p2.substring(random);
        children[1] = p2.substring(0, random) + p1.substring(random);
        return children;
    }

    private static void mutate() {
        for (int i = 0; i < POPULATION_SIZE; i++) {
            for (int j = 0; j < population[i].length(); j++) {
                if(Math.random() < MUTATION_CHANCE){
                    String temp = population[i].substring(0, j) + takeRandomChar();
                    if(j != population[i].length() - 1){
                        temp += population[i].substring(j+1);
                    }
                    population[i] = temp;
                }
            }
        }
    }

    private static void printPopulation(int iteration) {
        System.out.printf("Iteration %3d: , max fitness = %2d on %d (%s). All: ",
                iteration, maxFitness, maxFitnessIndex, population[maxFitnessIndex]);
        for (int s = 0; s < POPULATION_SIZE; s++) {
            System.out.print(population[s] + " (" + populationFitness[s] + ") | ");
        }
        System.out.println();
    }

    private static void createPopulationZero() {
        final int MIN = SIZE*SIZE/8;
        final int MAX = SIZE*SIZE/4;
        for (int i = 0; i < POPULATION_SIZE; i++) {
            population[i] = getPath(start,(int)(Math.random()))
        }
    }

    private static char takeRandomChar() {
        //ASCII small letters: 97-122 and space: 32 (in total 27 chars)
        int randomInt = (int) (Math.random() * 27);
        return randomInt == 0 ? (char) 32 : (char) (randomInt + 96);
    }
}
*/
