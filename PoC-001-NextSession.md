# PoC-001-NextSession.md

# PoC-001 Next Session

**Current Phase:** Transition from Prompt Engineering to Engineering Orchestration

---

# Current Position

The engineering methodology has reached a stable state.

The following have been validated:

* Engineering Constitution
* Developer Persona
* Runtime Prompt
* Story Package
* Output Locations
* Repository Structure
* Local LLM implementation quality

The remaining uncertainty lies primarily in the IDE orchestration layer.

---

# Immediate Objective

Determine whether Continue's Apply workflow limitation is:

* configurable,
* client-specific,
* or an inherent architectural limitation.

Avoid spending significant effort troubleshooting multiple IDE clients unless it contributes new architectural knowledge.

---

# Short Investigation

Perform a limited investigation into Continue itself.

Potential areas:

* Apply workflow
* WorkspaceEdit behavior
* Artifact parser
* tool routing
* GitHub issues
* configuration options
* source code (if necessary)

Terminate the investigation once sufficient evidence is collected.

The objective is understanding—not fixing Continue at any cost.

---

# Begin Engineering Platform Design

Start designing the Engineering Orchestration Layer independently of any IDE.

Primary objective:

The engineering platform should become the authoritative source of engineering behavior.

IDE clients become interchangeable front ends.

---

# Engineering MCP Research

Research the following topics:

* MCP protocol fundamentals
* local MCP servers
* Java MCP SDKs
* tool registration
* Continue MCP integration
* MCP client architecture

Document findings before implementation.

---

# Define Engineering MCP Scope (v0.1)

Initial services should remain intentionally small.

Possible capabilities:

* Load Story Package
* Parse Story metadata
* Resolve Output Locations
* Resolve Write Scope
* Read artifacts
* Create artifacts
* Modify artifacts

Avoid implementing business validation in the first version.

---

# Architecture Draft

Produce a high-level architecture for:

Engineering MCP

Possible modules:

* Story Service
* Repository Service
* Artifact Service
* Validation Service
* Prompt Assembly Service

Keep the design implementation-independent.

---

# Prompt Assembly

Evaluate moving prompt construction into the orchestration layer.

Instead of manually assembling prompts inside the IDE:

Developer Request

↓

Prompt Assembly

↓

Story Package

↓

Business Rules

↓

Architecture

↓

Canonical Examples

↓

Local LLM

This will improve repeatability.

---

# Long-Term Roadmap

Target architecture:

Developer Agent

↓

Engineering MCP

↓

Repository

↓

Tester Agent

↓

Engineering MCP

↓

Reviewer Agent

↓

Engineering MCP

All engineering operations should pass through the same orchestration layer.

---

# Success Criteria for PoC-002

Engineering Engine should be capable of:

* reading Story Packages
* assembling prompts automatically
* invoking the local LLM
* interpreting generated artifacts
* creating repository files
* enforcing Write Scope
* enforcing Output Locations

IDE integration should be treated as an adapter rather than the core implementation.

---

# Future Deliverables

* Engineering MCP Architecture
* Engineering MCP v0.1 Design
* Prompt Assembly Engine
* Story Package Parser
* Artifact Creation Service
* Engineering Tool Contracts

---

# Guiding Principle

The long-term objective is **not** to become dependent on any specific IDE extension.

The engineering methodology, orchestration, and repository semantics should remain fully owned by the platform, allowing any compatible client or local LLM to participate without changing the underlying engineering process.
