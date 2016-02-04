package uk.co.dnlegge;

import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IMolecularFormula;
import org.openscience.cdk.tools.manipulator.MolecularFormulaManipulator;

public class MolecularWeightCalculation implements Calculation {

    public double main(IAtomContainer mol) {
        IMolecularFormula formula = MolecularFormulaManipulator.getMolecularFormula(mol);
        return MolecularFormulaManipulator.getNaturalExactMass(formula);
    }

}
