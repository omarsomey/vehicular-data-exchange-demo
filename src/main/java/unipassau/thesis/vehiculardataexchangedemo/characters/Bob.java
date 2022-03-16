package unipassau.thesis.vehiculardataexchangedemo.characters;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Bob extends Character{}
