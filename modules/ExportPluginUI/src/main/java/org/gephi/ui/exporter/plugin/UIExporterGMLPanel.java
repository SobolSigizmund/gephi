/*
Copyright 2008-2011 Gephi
Authors : Taras Klaskovsky <megaterik@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.

Copyright 2011 Gephi Consortium. All rights reserved.

The contents of this file are subject to the terms of either the GNU
General Public License Version 3 only ("GPL") or the Common
Development and Distribution License("CDDL") (collectively, the
"License"). You may not use this file except in compliance with the
License. You can obtain a copy of the License at
http://gephi.org/about/legal/license-notice/
or /cddl-1.0.txt and /gpl-3.0.txt. See the License for the
specific language governing permissions and limitations under the
License.  When distributing the software, include this License Header
Notice in each file and include the License files at
/cddl-1.0.txt and /gpl-3.0.txt. If applicable, add the following below the
License Header, with the fields enclosed by brackets [] replaced by
your own identifying information:
"Portions Copyrighted [year] [name of copyright owner]"

If you wish your version of this file to be governed by only the CDDL
or only the GPL Version 3, indicate your decision by adding
"[Contributor] elects to include this software in this distribution
under the [CDDL or GPL Version 3] license." If you do not indicate a
single choice of license, a recipient has the option to distribute
your version of this file under either the CDDL, the GPL Version 3 or
to extend the choice of license to its licensees as provided above.
However, if you add GPL Version 3 code and therefore, elected the GPL
Version 3 license, then the option applies only if the new code is
made subject to such option by the copyright holder.

Contributor(s):

Portions Copyrighted 2011 Gephi Consortium.
 */
package org.gephi.ui.exporter.plugin;

import org.gephi.io.exporter.plugin.ExporterGML;
import org.gephi.lib.validation.ValidationClient;
import org.netbeans.validation.api.builtin.Validators;
import org.netbeans.validation.api.ui.ValidationGroup;
import org.netbeans.validation.api.ui.ValidationPanel;

/**
 *
 * @author megaterik
 */
public class UIExporterGMLPanel extends javax.swing.JPanel implements ValidationClient {

    /** Creates new customizer UIExporterGMLPanel */
    public UIExporterGMLPanel() {
        initComponents();
    }

    void setup(ExporterGML exporter) {
        //get
        exportColorsCheckBox.setSelected(exporter.isExportColor());
        exportEdgeWeightCheckBox.setSelected(exporter.isExportEdgeSize());
        exportNotRecognizedCheckBox.setSelected(exporter.isExportNotRecognizedElements());
        exportPositionCheckBox.setSelected(exporter.isExportCoordinates());
        exportSizeCheckBox.setSelected(exporter.isExportNodeSize());
        normalizeCheckBox.setSelected(exporter.isNormalize());
        exportLabelCheckBox.setSelected(exporter.isExportLabel());
        spacesTextField.setText(Integer.toString(exporter.getSpaces()));

    }

    void unsetup(ExporterGML exporter) {
        //set
        exporter.setExportColor(exportColorsCheckBox.isSelected());
        exporter.setExportCoordinates(exportPositionCheckBox.isSelected());
        exporter.setExportEdgeSize(exportEdgeWeightCheckBox.isSelected());
        exporter.setExportLabel(exportLabelCheckBox.isSelected());
        exporter.setExportNodeSize(exportSizeCheckBox.isSelected());
        exporter.setExportNotRecognizedElements(exportNotRecognizedCheckBox.isSelected());
        exporter.setNormalize(normalizeCheckBox.isSelected());
        exporter.setSpaces(Integer.parseInt(spacesTextField.getText()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exportLabel = new javax.swing.JLabel();
        exportPositionCheckBox = new javax.swing.JCheckBox();
        exportColorsCheckBox = new javax.swing.JCheckBox();
        exportSizeCheckBox = new javax.swing.JCheckBox();
        exportEdgeWeightCheckBox = new javax.swing.JCheckBox();
        exportNotRecognizedCheckBox = new javax.swing.JCheckBox();
        normalizeCheckBox = new javax.swing.JCheckBox();
        normalizeLabel = new javax.swing.JLabel();
        exportLabelCheckBox = new javax.swing.JCheckBox();
        spacesLabel = new javax.swing.JLabel();
        spacesTextField = new javax.swing.JTextField();

        exportLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.exportLabel.text")); // NOI18N

        exportPositionCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.positionLabel.text")); // NOI18N

        exportColorsCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.colorsLabel.text")); // NOI18N

        exportSizeCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.sizeLabel.text")); // NOI18N

        exportEdgeWeightCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.edgeWeightLabel.text")); // NOI18N

        exportNotRecognizedCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.attributes.text")); // NOI18N
        exportNotRecognizedCheckBox.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportNotRecognizedCheckBoxActionPerformed(evt);
            }
        });

        normalizeCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.normalize.text")); // NOI18N
        normalizeCheckBox.setLabel(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.normalize.text")); // NOI18N

        normalizeLabel.setFont(new java.awt.Font("Ubuntu", 0, 10));
        normalizeLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.normalizeHintLabel.text")); // NOI18N

        exportLabelCheckBox.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.labelLabel.text")); // NOI18N

        spacesLabel.setText(org.openide.util.NbBundle.getMessage(UIExporterGMLPanel.class, "UIExporterGML.indentationLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exportLabel)
                    .addComponent(normalizeCheckBox)
                    .addComponent(spacesLabel))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(normalizeLabel)
                    .addComponent(exportEdgeWeightCheckBox)
                    .addComponent(exportSizeCheckBox)
                    .addComponent(exportColorsCheckBox)
                    .addComponent(exportPositionCheckBox)
                    .addComponent(exportLabelCheckBox)
                    .addComponent(exportNotRecognizedCheckBox)
                    .addComponent(spacesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPositionCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportColorsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportSizeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportEdgeWeightCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportLabelCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportNotRecognizedCheckBox)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(normalizeCheckBox)
                    .addComponent(normalizeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spacesLabel)
                    .addComponent(spacesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        exportNotRecognizedCheckBox.getAccessibleContext().setAccessibleName("\n"); // NOI18N
        exportNotRecognizedCheckBox.getAccessibleContext().setAccessibleDescription("");
        spacesTextField.getAccessibleContext().setAccessibleName("Indentation");
    }// </editor-fold>//GEN-END:initComponents

private void exportNotRecognizedCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportNotRecognizedCheckBoxActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_exportNotRecognizedCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox exportColorsCheckBox;
    private javax.swing.JCheckBox exportEdgeWeightCheckBox;
    private javax.swing.JLabel exportLabel;
    private javax.swing.JCheckBox exportLabelCheckBox;
    private javax.swing.JCheckBox exportNotRecognizedCheckBox;
    private javax.swing.JCheckBox exportPositionCheckBox;
    private javax.swing.JCheckBox exportSizeCheckBox;
    private javax.swing.JCheckBox normalizeCheckBox;
    private javax.swing.JLabel normalizeLabel;
    private javax.swing.JLabel spacesLabel;
    private javax.swing.JTextField spacesTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void validate(ValidationGroup group) {
        group.add(spacesTextField, Validators.REQUIRE_NON_EMPTY_STRING, Validators.REQUIRE_NON_NEGATIVE_NUMBER, Validators.REQUIRE_VALID_INTEGER);
    }

    public static ValidationPanel createValidationPanel(UIExporterGMLPanel innerPanel) {
        ValidationPanel validationPanel = new ValidationPanel();
        validationPanel.setInnerComponent(innerPanel);

        ValidationGroup group = validationPanel.getValidationGroup();
        innerPanel.validate(group);

        return validationPanel;
    }
}
