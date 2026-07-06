Context Files (Attachments):

@README.md @Engineering-Constitution.md @DeveloperPersona.md @Developer_Runtime_Prompt.md 
@CanonicalExamples.md @ProductSpecification.md @BusinessRules.md @SoftwareArchitecture.md 
@AggregateDesign.md @Story.md @ImplementationGuide.md

Prompt:

Before generating any implementation, construct an Implementation Plan.

The plan SHALL include:

1. Output Locations
2. Artifacts to be created
3. Artifacts to be modified
4. Any required assumptions

Do not begin implementation until this plan has been completed.

After completing the above, proceed to implement the story according to the attached engineering documentation.

The attached documents collectively define the complete engineering context for this implementation.

Your responsibilities are to:

• follow the Engineering Constitution;

• follow the Developer Persona;

• follow the Developer Runtime Prompt;

• preserve the approved Software Architecture;

• preserve all Business Rules;

• follow the engineering conventions demonstrated by the Canonical Engineering Examples.

The Story Package is the authoritative implementation contract.

Implement only the functionality approved by Story-003.

Modify or create ONLY the artifacts explicitly listed in the Story-003 Engineering Contract (Write Scope).

Use available file editing tools.

Do not generate patches.

Do not generate artifact previews.

Perform the filesystem operations directly.

If implementation requires:

- modifying any other artifact,

- introducing additional architectural components,

- making undocumented business assumptions,

- or interpreting ambiguous requirements,



STOP implementation and request clarification before proceeding.

When implementation is complete, generate all requested artifacts inside the approved output locations only.