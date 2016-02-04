package uk.co.dnlegge;

import org.openscience.cdk.interfaces.IAtom;
import org.openscience.cdk.interfaces.IAtomContainer;

public class HeavyAtomsCalculation implements Calculation {

    public double main(IAtomContainer mol) {
        int numHeavies = 0;
        for (IAtom atom : mol.atoms()) {
            if (atom.getAtomicNumber() > 1) {
                numHeavies++;
            }
        }
        return numHeavies;
    }

}
