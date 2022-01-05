package codeWars.kyu5.moleculeToAtoms_20201126;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.HashMap;
import org.junit.Test;

public class ParseMoleculeTest {

  @Test
  public void test_분자식_물() {
    String waterMolecule = "H2O";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("H", 2);
    atomsMap.put("O", 1);
    assertThat(ParseMolecule.getAtoms(waterMolecule), is(atomsMap));
  }

  @Test
  public void test_분자식_메탄() {
    String molecule = "CH4";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("C", 1);
    atomsMap.put("H", 4);
    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_분자식_부탄() {
    String molecule = "C4H10";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("C", 4);
    atomsMap.put("H", 10);
    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_분자식_산화은() {
    String molecule = "Ag2O";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("Ag", 2);
    atomsMap.put("O", 1);
    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_분자식_설탕() {
    String molecule = "C12H22O11";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("C", 12);
    atomsMap.put("H", 22);
    atomsMap.put("O", 11);
    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_분자식_수산화마그네슘() {
    String molecule = "Mg(OH)2";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("Mg", 1);
    atomsMap.put("O", 2);
    atomsMap.put("H", 2);
    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_복잡한_분자식1() {
    String molecule = "K4[ON(SO3)2]2";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("K", 4);
    atomsMap.put("O", 14);
    atomsMap.put("N", 2);
    atomsMap.put("S", 4);
    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_복잡한_분자식2() {
    String molecule = "As2{Be4C5[BCo3(CO2)3]2}4Cu5";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("As", 2);
    atomsMap.put("Be", 16);
    atomsMap.put("C", 44);
    atomsMap.put("B", 8);
    atomsMap.put("Co", 24);
    atomsMap.put("O", 48);
    atomsMap.put("Cu", 5);

    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_복잡한_분자식3() {
    String molecule = "(C5H5)Fe(CO)2CH3";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("C", 8);
    atomsMap.put("H", 8);
    atomsMap.put("Fe", 1);
    atomsMap.put("O", 2);

    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test
  public void test_복잡한_에탄올() {
    String molecule = "C2H5OH";
    HashMap<String, Integer> atomsMap = new HashMap<>();
    atomsMap.put("C", 2);
    atomsMap.put("H", 6);
    atomsMap.put("O", 1);

    assertThat(ParseMolecule.getAtoms(molecule), is(atomsMap));
  }

  @Test(expected = IllegalArgumentException.class)
  public void test_invalid_bracket_input() throws Exception {
    String molecule = "MgOH)2";
    ParseMolecule.getAtoms(molecule);
  }
}