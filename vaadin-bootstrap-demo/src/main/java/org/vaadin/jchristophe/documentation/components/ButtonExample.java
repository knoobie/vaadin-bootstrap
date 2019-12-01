package org.vaadin.jchristophe.documentation.components;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.Route;
import org.vaadin.jchristophe.BootstrapLayout;
import org.vaadin.jchristophe.bootstrap.components.BsButton;

@Route(value ="button")//, layout = BootstrapLayout.class)
public class ButtonExample extends BsDemoView {

    @Override
    protected void initView() {
        super.initView();
        createBasicExample();
        createButtonsOutline();
        createButtonsSize();
    }


    private void createBasicExample() {
        Div message = createMessageDiv("basic-message");
        message.setText("Default configuration for buttons");
        // begin-source-example
        // source-example-heading: Basic Example
        Div layout = new Div();
        layout.add(new BsButton("Primary").withPrimary());
        layout.add(new BsButton("Secondary").withSecondary());
        layout.add(new BsButton("Success").withSuccess());
        layout.add(new BsButton("Danger").withDanger());
        layout.add(new BsButton("Warning").withWarning());
        layout.add(new BsButton("Info").withInfo());
        layout.add(new BsButton("Light").withLight());
        layout.add(new BsButton("Dark").withDark());
        layout.add(new BsButton("Link").withLink());
        // end-source-example

        addCard("Basic Example", layout, message);
    }

    private void createButtonsOutline() {
        Div message = createMessageDiv("outline-message");
        message.setText("Outline colors for buttons");
        // begin-source-example
        // source-example-heading: Outline Example
        Div layout = new Div();
        layout.add(new BsButton("Primary").withOutlinePrimary());
        layout.add(new BsButton("Secondary").withOutlineSecondary());
        layout.add(new BsButton("Success").withOutlineSuccess());
        layout.add(new BsButton("Danger").withOutlineDanger());
        layout.add(new BsButton("Warning").withOutlineWarning());
        layout.add(new BsButton("Info").withOutlineInfo());
        layout.add(new BsButton("Light").withOutlineLight());
        layout.add(new BsButton("Dark").withOutlineDark());
        // end-source-example

        addCard("Outline Example", layout, message);
    }

    private void createButtonsSize() {
        Div message = createMessageDiv("size-message");
        message.setText("Different sizes for buttons");
        // begin-source-example
        // source-example-heading: Size Example
        Div layout = new Div();
        layout.add(new BsButton("Lg").withPrimary().withLg());
        layout.add(new BsButton("Sm").withSecondary().withSm());
        // end-source-example

        addCard("Size Example", layout, message);
    }


}
