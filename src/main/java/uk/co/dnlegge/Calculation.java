package uk.co.dnlegge;

import org.openscience.cdk.interfaces.IAtomContainer;

public interface Calculation {

    double main(IAtomContainer mol);

}
