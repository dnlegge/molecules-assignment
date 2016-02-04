package uk.co.dnlegge;

import java.io.IOException;

import org.openscience.cdk.exception.InvalidSmilesException;
import org.openscience.cdk.interfaces.IAtomContainer;
import org.openscience.cdk.interfaces.IChemObjectBuilder;
import org.openscience.cdk.silent.SilentChemObjectBuilder;
import org.openscience.cdk.smiles.SmilesParser;

public class Solution {
    public static void main(String[] args) {
        IChemObjectBuilder bldr = SilentChemObjectBuilder.getInstance();
        SmilesParser smipar = new SmilesParser(bldr);
        try {
            Calculate cal = new Calculate();
            int T = cal.getINTVal();
            while (T-- > 0) {
                int ch = cal.getINTVal();
                String smiles = cal.getStringVal();
                IAtomContainer mol = smipar.parseSmiles(smiles);

                //removed if-else ladder as each branch did the same
                //prop seemed to need to be a double rather than int
                double prop = Calculate.get_Prop(ch).main(mol);

                cal.getOutput().display(prop);
            }
        } catch (IOException | InvalidSmilesException e) {
            System.out.print(e);
        }
    }
}