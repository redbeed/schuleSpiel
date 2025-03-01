/**
 * 
 */
package de.schule.madnx.client.game;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * @author xgadscj
 *
 */
public class PlayerUI extends Composite {

	private FlowPanel rootPanel;
	private FlowPanel body;
	private FlowPanel head;
	private boolean enabled;
	private int x;
	private int y;
	private int id;

	public PlayerUI(String style, int x, int y, int id) {
		this.x = x;
		this.y = y;
		this.id = id;
		init();
		initStyles(style);
	}

	@Override
	public Widget asWidget() {
		return rootPanel;
	}

	private void initStyles(String style) {
		rootPanel.setStyleName("figure");
		body.setStyleName("body");
		head.setStyleName("head");
		body.addStyleName(style);
		head.addStyleName(style);
	}

	public void addClickHandler(ClickHandler handler) {
		rootPanel.addDomHandler(handler, ClickEvent.getType());
	}

	private void init() {
		rootPanel = new FlowPanel();
		body = new FlowPanel();
		head = new FlowPanel();

		rootPanel.add(body);
		rootPanel.add(head);
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getId() {
		return id;
	}
	
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	
	@Override
	public void addStyleName(String style) {
		rootPanel.addStyleName(style);
	}
	
	@Override
	public void removeStyleName(String style) {
		rootPanel.removeStyleName(style);
	}
}
