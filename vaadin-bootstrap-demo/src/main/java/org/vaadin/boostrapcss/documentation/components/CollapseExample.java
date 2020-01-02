package org.vaadin.boostrapcss.documentation.components;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import org.vaadin.boostrapcss.components.BsButton;
import org.vaadin.boostrapcss.components.BsCard;
import org.vaadin.boostrapcss.utils.CollapsibleUtil;
import org.vaadin.boostrapcss.demo.BsDemoView;

@Route(value = CollapseExample.CURRENT_URL)
public class CollapseExample extends BsDemoView {

    public static final String CURRENT_URL = "components/collapse/";

    public CollapseExample() {
        super(BOOTSTRAP_DOCS_ROOT + CURRENT_URL);
    }
    @Override
    protected void initView() {
        super.initView();
        createCollapse();
        createCollapseCard();
        createAccordion();
    }

    public void createCollapse() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for collapse");
        Div layout = new Div();

        // begin-source-example
        // source-example-heading: Basic Example
        BsButton button = new BsButton("Collapse").withPrimary();
        Div collapsibleLayout = new Div();
        collapsibleLayout.add(new Text("collapsible"));
        CollapsibleUtil.addCollapsible(button, collapsibleLayout);
        layout.add(button,collapsibleLayout);
        // end-source-example

        addCodeExample("Basic Example", layout, message);

    }

    public void createCollapseCard() {
        Div message = createMessageDiv("card-message");
        message.setText("Default configuration for collapse");
        Div layout = new Div();

        // begin-source-example
        // source-example-heading: Card Content collapsible
        BsCard card = new BsCard();
        card.setCardHeaderText("Featured");
        card.setCardTitleText("Special title treatment");
        card.setCardText("With supporting text below as a natural lead-in to additional content.");
        CollapsibleUtil.addCollapsible(card.getCardHeader(), card.getCardBody());
        layout.add(card);
        // end-source-example

        addCodeExample("Card Content collapsible", layout, message);

    }


    ////// Does not work
    public void createAccordion() {
        Div message = createMessageDiv("accordion-message");
        message.setText("Default configuration for accordion");
        Div layout = new Div();

        // begin-source-example
        // source-example-heading: Accordion Example
        BsButton button = new BsButton("Collapse");
        Div collapsibleLayout = new Div();
        collapsibleLayout.add(new Text("collapsible"));
        CollapsibleUtil.addAccordion(layout, button, collapsibleLayout);
        BsButton button2 = new BsButton("Collapse2");
        Div collapsibleLayout2 = new Div();
        collapsibleLayout2.add(new Text("collapsible2"));
        CollapsibleUtil.addAccordion(layout, button2, collapsibleLayout2);
        layout.add(button,collapsibleLayout, button2,collapsibleLayout2);
        // end-source-example

        addCodeExample("Accordion Example", layout, message);

    }

}