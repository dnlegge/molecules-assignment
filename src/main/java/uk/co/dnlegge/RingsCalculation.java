package uk.co.dnlegge;

import org.openscience.cdk.graph.ConnectivityChecker;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IAtomContainerSet;
import org.openscience.cdk.interfaces.IRingSet;
import org.openscience.cdk.ringsearch.SSSRFinder;

public class RingsCalculation implements Calculation {

    public double main(IAtomContainer mol) {
        IAtomContainerSet components = ConnectivityChecker.partitionIntoMolecules(mol);
        int totalRingCount = 0;
        for (int i = 0; i < components.getAtomContainerCount() - 1; i++) {
            IAtomContainer component = components.getAtomContainer(i);
            IRingSet ringset = new SSSRFinder(component).findSSSR();
            totalRingCount += ringset.getAtomContainerCount();
        }

        return totalRingCount;
    }


}
