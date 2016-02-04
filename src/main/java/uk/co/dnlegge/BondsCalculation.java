package uk.co.dnlegge;

import org.openscience.cdk.interfaces.IAtomContainer;

public class BondsCalculation implements Calculation {

    public double main(IAtomContainer mol) {
        int bondCount = mol.getBondCount();

        return bondCount;
    }

}
